统一管理所有的sql

共享的sql

#namespace("timeline")
#include("front/timeline.sql")
#end

#namespace("share")
#include("share.sql")
#end
 
#namespace("agentUser")
#include("front/agentUser.sql")
#end

登录sql
#namespace("login")
#include("front/login.sql");
#end

#namespace("meta")
#include("front/meta.sql")
#end

文章sql
#namespace("detail")
#include("front/detail.sql");
#end

首页sql
#namespace("index")
#include("front/index.sql");
#end

#namespace("comment")
#include("front/comment.sql");
#end


后台sql
#namespace("adminArticle")
#include("back/article.sql")
#end
#namespace("adminKv")
#include("back/kv.sql")
#end
#namespace("statistics")
#include("back/statistics.sql")
#end
#namespace("adminDisk")
#include("back/disk.sql")
#end
#namespace("adminComment")
#include("back/comment.sql")
#end
 
#namespace("adminBlogroll")
#include("back/blogroll.sql")
#end
#namespace("adminBaiduseo")
#include("back/baiduseo.sql")
#end
#namespace("adminMetaRelevance")
#include("back/meta_relevance.sql")
#end
#namespace("adminMeta")
#include("back/meta.sql")
#end
#namespace("adminMetaweblogRelevance")
#include("back/metaweblog_relevance.sql")
#end
#namespace("adminConfig")
#include("back/config.sql")
#end
#namespace("adminLoginRecord")
#include("back/loginRecord.sql")
#end
#namespace("page")
#include("back/page.sql")
#end

加载通用sql组件
#include("common.sql");