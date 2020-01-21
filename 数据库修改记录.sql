/*---------------------------------创建功能表---------------------------------------*/
CREATE TABLE  cms_pub_function
(
                                   function_id varchar(64) not null comment '功能ID',
                                   function_name nvarchar(64) not null  comment  '功能名字',
                                   function_url varchar(64) comment '功能url',
                                   description nvarchar(500) comment '功能描述',
                                   parentFunction varchar(64) comment  '父类功能',
                                   primary key (function_id),
                                   unique (function_id,function_name,function_url),
                                  constraint fk_function_id foreign key  (parentFunction)  references cms_pub_function(function_id)
)  comment ='功能表' default charset = utf8;
/**--------------------------------创建文章表-------------------------------------*/
create table CMS_PUB_ARTICLE
(
    id          nvarchar(64)  not null,
    title       nvarchar(200) not null comment '标题',
    author      nvarchar(64)  not null comment '作者',
    createTime  timestamp     not null comment '创建时间',
    function_id varchar(64)   not null comment '栏目ID',
    likeNum     int default 0 comment '点赞数',
    commentNum  int  default  0 comment '评论数',
    primary key (id),
    constraint fk_article_function_id foreign key(function_id) references cms_pub_function(function_id),
    constraint fk_article_user_author foreign key (author) references cms_ath_user(user_id)

) comment = '文章表' default charset ='utf8';
/**----------------------------------用户表--------------------------------------*/
CREATE TABLE CMS_ATH_USER
(
    user_id varchar(64) not null ,
    user_name nvarchar(64) not null comment '用户名',
    login_name nvarchar(10) not null comment '登录名',
    passWord nvarchar(16) not null comment '登录密码',
    headPortrait nvarchar(400) not null comment '头像',
    tel varchar(11) comment '手机号',
    qq nvarchar(12) comment '关联qq',
    primary key (user_id) ,
    unique key (user_name, tel)
) comment = '用户名' charset ='utf8'