/**--------------------------------------------------公共菜单----------------------------------------------------------**/
insert into cms_pub_function(function_id, function_name, function_url, description, parentFunction)
values ('1', '首页', '/', '首页', null);

insert into cms_pub_function(function_id, function_name, function_url, description, parentFunction)
values ('11', '推荐', '/recommend', '推荐', '1');

insert into cms_pub_function(function_id, function_name, function_url, description, parentFunction)
values ('12', '前端', '/frontend', '前端', '1');
insert into cms_pub_function(function_id, function_name, function_url, description, parentFunction)
values ('121', 'HTML', '/html', 'HTML', '12');
insert into cms_pub_function(function_id, function_name, function_url, description, parentFunction)
values ('122', 'CSS', '/css', 'CSS', '12');
insert into cms_pub_function(function_id, function_name, function_url, description, parentFunction)
values ('123', 'VUE', '/vue', 'VUE', '12');
insert into cms_pub_function(function_id, function_name, function_url, description, parentFunction)
values ('124', 'node', '/node', 'node', '12');

insert into cms_pub_function(function_id, function_name, function_url, description, parentFunction)
values ('13', '后端', '/backend', '后端', '1');
insert into cms_pub_function(function_id, function_name, function_url, description, parentFunction)
values ('131', 'JAVA', '/java', 'JAVA', '13');
insert into cms_pub_function(function_id, function_name, function_url, description, parentFunction)
values ('132', 'Spring', '/spring', 'Spring', '13');
insert into cms_pub_function(function_id, function_name, function_url, description, parentFunction)
values ('133', 'netty', '/netty', 'netty', '13');
insert into cms_pub_function(function_id, function_name, function_url, description, parentFunction)
values ('134', 'oracle', '/oracle', 'oracle', '13');

insert into cms_pub_function(function_id, function_name, function_url, description, parentFunction)
values ('14', 'IOS', '/ios', 'IOS', '1');

insert into cms_pub_function(function_id, function_name, function_url, description, parentFunction)
values ('15', '人工智能', '/ai', '人工智能', '1');

insert into cms_pub_function(function_id, function_name, function_url, description, parentFunction)
values ('16', '开发工具', '/ide', '开发工具', '1');

insert into cms_pub_function(function_id, function_name, function_url, description, parentFunction)
values ('17', '代码人生', '/codeLife', '代码人生', '1');

insert into cms_pub_function(function_id, function_name, function_url, description, parentFunction)
values ('18', '阅读', '/read', '阅读', '1');

insert into cms_pub_function(function_id, function_name, function_url, description, parentFunction)
values ('2', '沸点', '/hot', '沸点', null);

insert into cms_pub_function(function_id, function_name, function_url, description, parentFunction)
values ('3', '话题', '/topic', '话题', null);

insert into cms_pub_function(function_id, function_name, function_url, description, parentFunction)
values ('4', '小册', '/books', '小册', null);

insert into cms_pub_function(function_id, function_name, function_url, description, parentFunction)
values ('5', '活动', '/activity', '活动', null);
/**------------------------------------------------------公共文章-----------------------------------------------**/
insert into cms_pub_article (id, title, author, createTime, function_id, likeNum, commentNum)
values (UUID(),'webpack 最佳配置指北','b781f5f0-3c13-11ea-8b89-00ff41181cd7',sysdate(),'121',10,50);
insert into cms_pub_article (id, title, author, createTime, function_id, likeNum, commentNum)
values (UUID(),'图文并茂，为你揭开“单点登录“的神秘面纱','b781f5f0-3c13-11ea-8b89-00ff41181cd7',sysdate(),'121',10,50);
/**---------------------------------------------------用户-------------------------------------------------------**/
INSERT INTO cms_ath_user (user_id, user_name, login_name, passWord, headPortrait, tel, qq)
values (UUID(),'柯南小海盗','knxhd','001','F:\\study\\coding\\cms\\headPortrait\\default.jpg',null,null);
INSERT INTO cms_ath_user (user_id, user_name, login_name, passWord, headPortrait, tel, qq)
values (UUID(),'灰原哀','huiyuan','001','F:\\study\\coding\\cms\\headPortrait\\default.jpg',null,null);
