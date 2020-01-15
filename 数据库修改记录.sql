/*---------------------------------创建功能表---------------------------------------*/
CREATE TABLE  cms_ath_function (
                                   function_id varchar(64) not null comment '功能ID',
                                   function_name nvarchar(64) not null  comment  '功能名字',
                                   function_url varchar(64) comment '功能url',
                                   description nvarchar(500) comment '功能描述',
                                   parentFunction varchar(64) comment  '父类功能',
                                   primary key (function_id),
                                   unique (function_id,function_name,function_url),
                                  constraint fk_function_id foreign key  (parentFunction)  references cms_ath_function(function_id)
)  comment ='功能表' default charset = utf8;