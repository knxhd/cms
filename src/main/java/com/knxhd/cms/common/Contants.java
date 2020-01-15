package com.knxhd.cms.common;

import lombok.Data;

/**
 * @ClassName Contants
 * @description
 * @author: tianluhua
 * @date 2020/1/13 12:23
 */
@Data
public class Contants {

    public static enum Result {

        SUCCESS("success","操作成功"),

        ERROR("error","操作失败")
        ;


        private String message;

        private String status;

        Result(String status, String message) {
            this.message = message;
            this.status = status;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }
}
