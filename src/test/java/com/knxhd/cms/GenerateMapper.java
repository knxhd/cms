package com.knxhd.cms;

import com.knxhd.cms.dto.ath.AthUserDto;
import com.knxhd.cms.entity.pub.PubFunction;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Field;

/**
 * @ClassName GenerateMapper
 * @description
 * @author: tianluhua
 * @date 2020/1/21 09:54
 */
public class GenerateMapper {

    public static void main(String[] args) {
        AthUserDto athUserDto = new AthUserDto();
        System.err.println(getResultMap(athUserDto));
    }

    private static  <T> String getResultMap(T dto) {
        StringBuilder result = new StringBuilder();
        result.append("<resultMap id=\"");
        Class<?> aClass = dto.getClass();
        String simpleName = aClass.getSimpleName();
        simpleName = simpleName.replaceAll("Dto","Map");
        result.append(simpleName);
        result.append("\"  type=\"");
        String name = aClass.getName();
        result.append(name);
        result.append("\">\n");
        Field[] fields = aClass.getDeclaredFields();
        for (Field field : fields) {
            String fieldName = field.getName();
            result.append("<result property=\"");
            result.append(fieldName);
            result.append("\"  column=\"");
            result.append(fieldName);
            result.append("\"/>\n");
        }
         result.append("</resultMap>");
        return result.toString();
    }
}
