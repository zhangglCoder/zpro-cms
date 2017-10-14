<#assign base = request.contextPath />
<!DOCTYPE html >
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>

    <title>H5游戏开服时间表_今日H5游戏开服表_nowh5游戏网</title>
    <meta name="keywords" content="H5游戏开服表,h5游戏开服大全,h5游戏新服"/>
    <meta name="description" content="nowh5游戏为您提供全面的H5游戏开服表信息,h5游戏开服资料尽在nowh5游戏"/>
    <link rel="stylesheet" type="text/css" href="/style/css/pc_7724.css"/>
    <script type="text/javascript" src="/style/js/jquery.js"></script>
    <script type="text/javascript" src="/style/js/jquery.qrcode.min.js"></script>
    <script type="text/javascript" src="/style/js/pc_7724.js"></script>
    <script type="text/javascript" src="/style/js/jquery.SuperSlide.2.1.1.js"></script>
    <!-- 内容复制 -->
    <script type="text/javascript" src="/style/js/ZeroClipboard.js"></script>
</head>

<body>


<div class="general">
    <!--面包屑-->
    <div class="h5_local">
        <em class="local_home">当前位置：</em>
        <a href="/">首页</a><span>&gt;</span>
        <em>开服列表</em>
    </div>
    <div class="contentbg">
        <p class="kaifu_tit"><span>开服表</span></p>
        <div class="open_table_left">
            <div class="open_t_l_top"></div>
            <div class="open_t_l_center"></div>
            <div class="open_t_l_top"></div>
        </div>
        <div class="open_table_right">
            <div class=open_t_r_top>
                <div class="open_t_r_tit open_t_r_tit1">
                    <p>今日开服 ${.now?string("MM-dd")}</p>
                </div>
                <div class="open_t_r_table">
                    <table cellpadding="0" cellspacing="0" border="0" width="100%">

                        <#list todayList as item>
                            <tr>
                                <td width="12%">
                                    <a href="http://www.nowh5.com${item.titleUrl}" title="${item.title}">
                                        <img src="${item.titlePic}" alt="${item.title}"
                                             class="img1"/></a>
                                </td>
                                <td width="25%">
                                    <p class="p1">
                                        <em>
                                            <a href="http://www.nowh5.com${item.titleUrl}" class="a1">${item.title}</a>
                                        </em>
                                    </p>
                                    <p class="p1">
                                    <span>
                                    ${item.type}
                                    </span>
                                    </p>
                                </td>
                                <td width="13%">
                                    <p class="p2"><span>
                                    ${item.openTime?datetime("yyyy-MM-dd HH:mm")}
                                    </span></p>
                                </td>
                                <td width="20%">
                                    <p class="p2"><i>${item.area}</i></p>
                                </td>
                                <td width="30%">
                                    <p class="p3">
                                        <a href="/search/?keyword=三生三世十里桃花&keytype=libao" class="a2">礼包领取</a>
                                        <a href="http://www.nowh5.com${item.titleUrl}" class="a1">进入专区</a>
                                    </p>
                                </td>
                            </tr>
                        </#list>

                    </table>
                </div>
            </div>


            <div class=open_t_r_top>
                <div class="open_t_r_tit open_t_r_tit2"><p>即将开服</p></div>

                <div class="open_t_r_jjkc">
                    <table cellpadding="0" cellspacing="0" border="0" width="100%">
                        <tr>
                            <th width="15%">时间</th>
                            <th width="25%">游戏名称</th>
                            <th width="15%">游戏类型</th>
                            <th width="15%">服务器名称</th>
                            <th width="15%">礼包领取</th>
                            <th width="15%">专区资料</th>
                        </tr>
                        <#list comingList as item>
                            <tr>
                                <td>
                                ${item.openTime?datetime("yyyy-MM-dd HH:mm")}
                                </td>
                                <td><p class="p1"><a href="http://www.nowh5.com${item.titleUrl}" class="a1">${item.title}</a></p></td>
                                <td><p class="p2">
                                        ${item.type}
                                </td>
                                <td><p class="p2"><i>${item.area}</i></p></td>
                                <td>
                                    <p class="p3">
                                        <a href="/search/?keyword=三生三世十里桃花&keytype=libao" class="a2">礼包领取</a>
                                    </p>
                                </td>
                                <td>
                                    <p class="p3">
                                        <a href="http://www.nowh5.com${item.titleUrl}" class="a1">进入专区</a>
                                    </p>
                                </td>
                            </tr>
                        </#list>

                    </table>
                </div>
            </div>


        </div>
    </div>
</div>

<!--底部-->
<div class="footer">
    <div class="general">
        <p>
            <a href="/feedback.html">意见反馈</a>|
            <a href="/aboutus.html">关于我们</a>|
            <a href="/linkus.html">联系我们</a>|
            <a href="/cooperation.html">游戏合作</a>|
            <a href="/sh/about/jh">家长监护</a>

        </p>
        <span>闽ICP备15008081号-2
           </span>
    </div>

</div>


</body>
</html>
