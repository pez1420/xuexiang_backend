[#assign shiro=JspTaglibs["/WEB-INF/tld/shiro.tld"] /]
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="ThemeBucket">
    <link rel="shortcut icon" href="#" type="image/png">

    <title>${message("admin.main.title")} - Powered By XueXiang</title>

    <link href="${base}/resources/css/admin/style.css" rel="stylesheet">
    <link href="${base}/resources/css/admin/style-responsive.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="${base}/resources/html5shiv.js"></script>
    <script src="${base}/resources/respond.min.js"></script>
    <![endif]-->
</head>

<body class="sticky-header">

<script type="text/javascript">
    if (self != top) {
        top.location = self.location;
    }
    ;
</script>

<section>
    <!-- 页面左部开始 -->
    <div class="left-side sticky-left-side">
        <!-- 左上角logo部分 -->
        <div class="logo">
            <a href="main.jhtml"><img src="${base}/resources/images/admin/logo.png" alt=""></a>
        </div>
        <div class="logo-icon text-center">
            <a href="main.jhtml"><img src="${base}/resources/images/admin/logo_icon.png" alt=""></a>
        </div>

        <div class="left-side-inner">
            <!-- 侧边导航栏 -->
            <ul class="nav nav-pills nav-stacked custom-nav" id="left-menu">

                <li class="menu-list nav-active" id="left-menu1" style="">
                    <a href=""><i class="fa fa-laptop"></i><span>系统设置</span></a>
                    <ul class="sub-menu-list">
                        <li class="active"><a href="main.html" target="iframe">系统概况</a></li>
                        <li><a href="login.html" target="iframe"> 系统设置</a></li>
                        <li><a href="../admin/list.jhtml" target="iframe"> 管理人员</a></li>
                        <li><a href="../role/list.jhtml" target="iframe"> 角色管理</a></li>
                        <li><a href="../log/list.jhtml" target="iframe"> 日志管理</a></li>
                        <li><a href="system_set/log/log_view.html" target="iframe"> 地区管理</a></li>
                        <li><a href="system_set/log/log_view.html" target="iframe"> 学校管理</a></li>
                        <li><a href="system_set/log/log_view.html" target="iframe"> 登录插件</a></li>
                        <li><a href="system_set/log/log_view.html" target="iframe"> 支付方式</a></li>
                        <li><a href="system_set/log/log_view.html" target="iframe"> 支付插件</a></li>
                        <li><a href="system_set/log/log_view.html" target="iframe"> 存储插件</a></li>
                        <li><a href="system_set/log/log_view.html" target="iframe"> 发送消息</a></li>
                        <li><a href="system_set/log/log_view.html" target="iframe"> 消息列表</a></li>
                    </ul>
                </li>


                <li class="menu-list" id="left-menu2"  style="display: none">
                    <a href=""><i class="fa fa-book"></i> <span>内容管理</span></a>
                    <ul class="sub-menu-list">
                        <li><a href="content/navigation/navigation_view.html" target="iframe"> 导航管理</a></li>
                        <li><a href="content/adposition/adposition_view.html" target="iframe"> 广告位置</a></li>
                        <li><a href="content/ad/ad_view.html" target="iframe"> 广告管理</a></li>
                        <li><a href="content/template/template_list.html" target="iframe"> 模板管理</a></li>
                        <li><a href="content/cache/cache_clear.html" target="iframe"> 缓存管理</a></li>
                        <li><a href="content/static/static.html" target="iframe"> 静态页面</a></li>
                    </ul>
                </li>


                <li class="menu-list" id="left-menu3"  style="display: none">
                    <a href="#"><i class="fa fa-map-marker"></i> <span>会员管理</span></a>
                    <ul class="sub-menu-list" style="display: none;">
                        <li><a href="contactus/leave_message/leave_message_view.html" target="iframe"> 会员管理</a></li>
                        <li><a href="vector_map.html" target="iframe"> 笔记管理</a></li>
                        <li><a href="vector_map.html" target="iframe"> 评论管理</a></li>
                        <li><a href="vector_map.html" target="iframe"> 咨询管理</a></li>
                    </ul>
                </li>


                <li class="menu-list" id="left-menu4"  style="display: none">
                    <a href="#"><i class="fa fa-map-marker"></i> <span>统计分析</span></a>
                    <ul class="sub-menu-list">
                        <li><a href="system_set/log/log_view1.html" target="iframe"> <i class="fa fa-book"></i>来客分析</a></li>
                        <li><a href="system_set/log/log_view1.html" target="iframe"> <i class="fa fa-book"></i>图形分析</a></li>
                        <li><a href="system_set/log/log_view1.html" target="iframe"> <i class="fa fa-book"></i>来客分析</a></li>
                        <li><a href="system_set/log/log_view1.html" target="iframe"> <i class="fa fa-book"></i>图形分析</a></li>
                        <li><a href="system_set/log/log_view1.html" target="iframe"> <i class="fa fa-book"></i>来客分析</a></li>
                        <li><a href="system_set/log/log_view1.html" target="iframe"> <i class="fa fa-book"></i>图形分析</a></li>
                        <li><a href="system_set/log/log_view1.html" target="iframe"> <i class="fa fa-book"></i>来客分析</a></li>
                        <li><a href="system_set/log/log_view1.html" target="iframe"> <i class="fa fa-book"></i>图形分析</a></li>
                        <li><a href="system_set/log/log_view1.html" target="iframe"> <i class="fa fa-book"></i>来客分析</a></li>
                        <li><a href="system_set/log/log_view1.html" target="iframe"> <i class="fa fa-book"></i>图形分析</a></li>
                    </ul>
                </li>

                <li class="menu-list" id="left-menu5"  style="display: none">
                    <a href="#"><i class="fa fa-map-marker"></i> <span>统计分析</span></a>
                    <ul class="sub-menu-list">
                        <li><a href="system_set/log/log_view1.html" target="iframe"> <i class="fa fa-book"></i>来客分析</a></li>
                        <li><a href="system_set/log/log_view1.html" target="iframe"> <i class="fa fa-book"></i>图形分析</a></li>
                        <li><a href="system_set/log/log_view1.html" target="iframe"> <i class="fa fa-book"></i>来客分析</a></li>
                        <li><a href="system_set/log/log_view1.html" target="iframe"> <i class="fa fa-book"></i>图形分析</a></li>
                        <li><a href="system_set/log/log_view1.html" target="iframe"> <i class="fa fa-book"></i>来客分析</a></li>
                        <li><a href="system_set/log/log_view1.html" target="iframe"> <i class="fa fa-book"></i>图形分析</a></li>
                        <li><a href="system_set/log/log_view1.html" target="iframe"> <i class="fa fa-book"></i>来客分析</a></li>
                        <li><a href="system_set/log/log_view1.html" target="iframe"> <i class="fa fa-book"></i>图形分析</a></li>
                        <li><a href="system_set/log/log_view1.html" target="iframe"> <i class="fa fa-book"></i>来客分析</a></li>
                        <li><a href="system_set/log/log_view1.html" target="iframe"> <i class="fa fa-book"></i>图形分析</a></li>
                    </ul>
                </li>

                <li class="menu-list" id="left-menu6"  style="display: none">
                    <a href="#"><i class="fa fa-map-marker"></i> <span>基础内容</span></a>
                    <ul class="sub-menu-list">
                        <li><a href="basis/country/country_view.html" target="iframe"> 国家管理</a></li>
                        <li><a href="basis/university/university_view.html" target="iframe"> 学校管理</a></li>
                        <li><a href="basis/subject/subject_view.html" target="iframe"> 科目管理</a></li>
                        <li><a href="basis/major/major_view.html" target="iframe"> 专业管理</a></li>
                        <li><a href="basis/course/course_view.html" target="iframe"> 课程管理</a></li>
                    </ul>
                </li>

            </ul>
        </div>
    </div>

    <!-- 页面右部开始 -->
    <div class="main-content">
        <!-- 搜索框 -->
        <div class="header-section">
            <!-- 左变页面隐藏按钮 -->
            <a class="toggle-btn"><i class="fa fa-bars"></i></a>

            <!-- 头部右边用户菜单 -->
            <div class="menu-right">
                <ul class="notification-menu">
                    <li>
                        <a href="#" class="btn btn-default dropdown-toggle info-number" data-toggle="dropdown">
                            <i class="fa fa-envelope-o"></i>
                            <span class="badge">5</span>
                        </a>

                        <div class="dropdown-menu dropdown-menu-head pull-right">
                            <h5 class="title">您有5条留言 </h5>
                            <ul class="dropdown-list normal-list">
                                <li class="new">
                                    <a href="">
                                        <span class="thumb"><img src="${base}/resources/images/admin/photos/user1.png"
                                                                 alt=""/></span>
                                                    <span class="desc">
                                                      <span class="name">John Doe <span
                                                              class="badge badge-success">new</span></span>
                                                      <span class="msg">Lorem ipsum dolor sit amet...</span>
                                                    </span>
                                    </a>
                                </li>
                                <li>
                                    <a href="">
                                        <span class="thumb"><img src="${base}/resources/images/admin/photos/user2.png"
                                                                 alt=""/></span>
                                                    <span class="desc">
                                                      <span class="name">Jonathan Smith</span>
                                                      <span class="msg">Lorem ipsum dolor sit amet...</span>
                                                    </span>
                                    </a>
                                </li>
                                <li>
                                    <a href="">
                                        <span class="thumb"><img src="${base}/resources/images/admin/photos/user3.png"
                                                                 alt=""/></span>
                                                    <span class="desc">
                                                      <span class="name">Jane Doe</span>
                                                      <span class="msg">Lorem ipsum dolor sit amet...</span>
                                                    </span>
                                    </a>
                                </li>
                                <li>
                                    <a href="">
                                        <span class="thumb"><img src="${base}/resources/images/admin/photos/user4.png"
                                                                 alt=""/></span>
                                                    <span class="desc">
                                                      <span class="name">Mark Henry</span>
                                                      <span class="msg">Lorem ipsum dolor sit amet...</span>
                                                    </span>
                                    </a>
                                </li>
                                <li>
                                    <a href="">
                                        <span class="thumb"><img src="${base}/resources/images/admin/photos/user5.png"
                                                                 alt=""/></span>
                                                    <span class="desc">
                                                      <span class="name">Jim Doe</span>
                                                      <span class="msg">Lorem ipsum dolor sit amet...</span>
                                                    </span>
                                    </a>
                                </li>
                                <li class="new"><a href="">Read All Mails</a></li>
                            </ul>
                        </div>
                    </li>
                    <li>
                        <a href="#" class="btn btn-default dropdown-toggle info-number" data-toggle="dropdown">
                            <i class="fa fa-bell-o"></i>
                            <span class="badge">4</span>
                        </a>

                        <div class="dropdown-menu dropdown-menu-head pull-right">
                            <h5 class="title">消息通知</h5>
                            <ul class="dropdown-list normal-list">
                                <li class="new">
                                    <a href="">
                                        <span class="label label-danger"><i class="fa fa-bolt"></i></span>
                                        <span class="name">Server #1 overloaded.  </span>
                                        <em class="small">34 mins</em>
                                    </a>
                                </li>
                                <li class="new">
                                    <a href="">
                                        <span class="label label-danger"><i class="fa fa-bolt"></i></span>
                                        <span class="name">Server #3 overloaded.  </span>
                                        <em class="small">1 hrs</em>
                                    </a>
                                </li>
                                <li class="new">
                                    <a href="">
                                        <span class="label label-danger"><i class="fa fa-bolt"></i></span>
                                        <span class="name">Server #5 overloaded.  </span>
                                        <em class="small">4 hrs</em>
                                    </a>
                                </li>
                                <li class="new">
                                    <a href="">
                                        <span class="label label-danger"><i class="fa fa-bolt"></i></span>
                                        <span class="name">Server #31 overloaded.  </span>
                                        <em class="small">4 hrs</em>
                                    </a>
                                </li>
                                <li class="new"><a href="">See All Notifications</a></li>
                            </ul>
                        </div>
                    </li>
                    <li>
                        <a href="#" class="btn btn-default dropdown-toggle" data-toggle="dropdown">
                            <i class="fa fa-user"></i> &nbsp;<strong>[@shiro.principal /]</strong> <span class="caret"></span>
                        </a>
                        <ul class="dropdown-menu dropdown-menu-usermenu pull-right">
                            <li><a href="#"><i class="fa fa-user"></i> 用户信息</a></li>
                            <li><a href="#"><i class="fa fa-cog"></i> 基本设置</a></li>
                            <li><a href="../logout.jsp"><i class="fa fa-sign-out"></i> 注销</a></li>
                        </ul>
                    </li>
                </ul>
            </div>

            <!-- 头部导航栏 -->
            <div class="menu-right admin-nav" id="admin-nav">
                <ul class="notification-menu">
                    <li>
                        <a href="#left-menu1" class="btn btn-default dropdown-toggle info-number">
                            <i class="fa fa-random"></i>
                            <span class="">系统</span>
                        </a>
                    </li>
                    <li>
                        <a href="#left-menu2" class="btn btn-default dropdown-toggle">
                            <i class="fa fa-dedent"></i>
                            <span class="">内容</span>
                        </a>
                    </li>
                    <li>
                        <a href="#left-menu3" class="btn btn-default dropdown-toggle">
                            <i class="fa fa-users"></i><span>会员</span>
                        </a>
                    </li>
                    <li>
                        <a href="#left-menu4" class="btn btn-default dropdown-toggle ">
                            <i class="fa fa-tasks"></i>
                            <span class="">留学</span>
                        </a>
                    </li>
                    <li>
                        <a href="#left-menu5" class="btn btn-default dropdown-toggle ">
                            <i class="fa fa-bell-o"></i>
                            <span class="">课程</span>
                        </a>
                    </li>
                    <li>
                        <a href="#left-menu6" class="btn btn-default dropdown-toggle ">
                            <i class="fa fa-bell-o"></i>
                            <span class="">基础</span>
                        </a>
                    </li>
                    <li>
                        <a href="#left-menu6" class="btn btn-default dropdown-toggle ">
                            <i class="fa fa-bell-o"></i>
                            <span class="">首页</span>
                        </a>
                    </li>
                </ul>
            </div>

        </div>

        <iframe id="iframe" name="iframe" src="overview.jhtml" frameborder="0" scrolling="no"
                width="100%" height="1000px">
        </iframe>

    </div>
</section>

<!-- Placed js at the end of the document so the pages load faster -->
<script src="${base}/resources/jquery-2.1.0.min.js"></script>
<script src="${base}/resources/jquery-ui-1.9.2.custom.min.js"></script>
<script src="${base}/resources/jquery-migrate-1.2.1.min.js"></script>
<script src="${base}/uilib/bootstrap-3/js/bootstrap.min.js"></script>
<script src="${base}/resources/modernizr.min.js"></script>
<script src="${base}/resources/admin/jquery.nicescroll.js"></script>
<!-- 所有页面共同脚本  -->
<script src="${base}/resources/admin/scripts.js"></script>

<script type="text/javascript">
    $(document).ready(function () {

        var $nav = $("#admin-nav a:not(:last)");
        var $menu = $("#left-menu > li");
        var $menuItem = $("#left-menu a");

        $nav.click(function () {
            var $this = $(this);
//            $nav.removeClass("current");
//            $this.addClass("current");
            var $currentMenu = $($this.attr("href"));
            $menu.hide();
            $currentMenu.show();
            return false;
        });

        $menuItem.click(function () {
            var $this = $(this);
//            $menuItem.removeClass("current");
//            $this.addClass("current");
        });

    });
</script>

</body>
</html>