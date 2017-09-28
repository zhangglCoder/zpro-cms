package cn.zpro.app.entity;
import java.io.Serializable;
import java.util.Date;

/**
* @table www_92game_net_ecms_flash 
* @author   <a href="mailto:742819432@qq.com">zhanggl</a>
* @Date	 2017-09-28
*/
public class EcmsFlash implements Serializable {

    private static final long serialVersionUID = -1L;

    /**
    * @描述: id 
    * @字段: id INT UNSIGNED(10)
    */
    private Integer id;
        /**
    * @描述: classid 
    * @字段: classid SMALLINT UNSIGNED(5)
    */
    private Integer classid;
        /**
    * @描述: ttid 
    * @字段: ttid SMALLINT UNSIGNED(5)
    */
    private Integer ttid;
        /**
    * @描述: onclick 
    * @字段: onclick INT UNSIGNED(10)
    */
    private Integer onclick;
        /**
    * @描述: plnum 
    * @字段: plnum MEDIUMINT UNSIGNED(7)
    */
    private Integer plnum;
        /**
    * @描述: totaldown 
    * @字段: totaldown MEDIUMINT UNSIGNED(7)
    */
    private Integer totaldown;
        /**
    * @描述: newspath 
    * @字段: newspath VARCHAR(20)
    */
    private String newspath;
        /**
    * @描述: filename 
    * @字段: filename VARCHAR(36)
    */
    private String filename;
        /**
    * @描述: userid 
    * @字段: userid MEDIUMINT UNSIGNED(7)
    */
    private Integer userid;
        /**
    * @描述: username 
    * @字段: username VARCHAR(20)
    */
    private String username;
        /**
    * @描述: firsttitle 
    * @字段: firsttitle TINYINT(3)
    */
    private Integer firsttitle;
        /**
    * @描述: isgood 
    * @字段: isgood TINYINT(3)
    */
    private Integer isgood;
        /**
    * @描述: ispic 
    * @字段: ispic TINYINT(3)
    */
    private Integer ispic;
        /**
    * @描述: istop 
    * @字段: istop TINYINT(3)
    */
    private Integer istop;
        /**
    * @描述: isqf 
    * @字段: isqf TINYINT(3)
    */
    private Integer isqf;
        /**
    * @描述: ismember 
    * @字段: ismember TINYINT(3)
    */
    private Integer ismember;
        /**
    * @描述: isurl 
    * @字段: isurl TINYINT(3)
    */
    private Integer isurl;
        /**
    * @描述: truetime 
    * @字段: truetime INT UNSIGNED(10)
    */
    private Integer truetime;
        /**
    * @描述: lastdotime 
    * @字段: lastdotime INT UNSIGNED(10)
    */
    private Integer lastdotime;
        /**
    * @描述: havehtml 
    * @字段: havehtml TINYINT(3)
    */
    private Integer havehtml;
        /**
    * @描述: groupid 
    * @字段: groupid SMALLINT UNSIGNED(5)
    */
    private Integer groupid;
        /**
    * @描述: userfen 
    * @字段: userfen SMALLINT UNSIGNED(5)
    */
    private Integer userfen;
        /**
    * @描述: titlefont 
    * @字段: titlefont VARCHAR(14)
    */
    private String titlefont;
        /**
    * @描述: titleurl 
    * @字段: titleurl VARCHAR(200)
    */
    private String titleurl;
        /**
    * @描述: stb 
    * @字段: stb TINYINT UNSIGNED(3)
    */
    private Integer stb;
        /**
    * @描述: fstb 
    * @字段: fstb TINYINT UNSIGNED(3)
    */
    private Integer fstb;
        /**
    * @描述: restb 
    * @字段: restb TINYINT UNSIGNED(3)
    */
    private Integer restb;
        /**
    * @描述: keyboard 
    * @字段: keyboard VARCHAR(80)
    */
    private String keyboard;
        /**
    * @描述: title 
    * @字段: title CHAR(100)
    */
    private String title;
        /**
    * @描述: newstime 
    * @字段: newstime INT UNSIGNED(10)
    */
    private Integer newstime;
        /**
    * @描述: titlepic 
    * @字段: titlepic CHAR(120)
    */
    private String titlepic;
        /**
    * @描述: flashwriter 
    * @字段: flashwriter VARCHAR(30)
    */
    private String flashwriter;
        /**
    * @描述: email 
    * @字段: email VARCHAR(80)
    */
    private String email;
        /**
    * @描述: star 
    * @字段: star TINYINT(3)
    */
    private Integer star;
        /**
    * @描述: filesize 
    * @字段: filesize VARCHAR(16)
    */
    private String filesize;
        /**
    * @描述: flashurl 
    * @字段: flashurl VARCHAR(255)
    */
    private String flashurl;
        /**
    * @描述: width 
    * @字段: width VARCHAR(12)
    */
    private String width;
        /**
    * @描述: height 
    * @字段: height VARCHAR(12)
    */
    private String height;
        /**
    * @描述: flashsay 
    * @字段: flashsay MEDIUMTEXT(16777215)
    */
    private String flashsay;
        /**
    * @描述: newstempid1 
    * @字段: newstempid_1 VARCHAR(255)
    */
    private String newstempid1;
        /**
    * @描述: newstempid1Filename 
    * @字段: newstempid_1_filename VARCHAR(255)
    */
    private String newstempid1Filename;
        /**
    * @描述: morepic 
    * @字段: morepic MEDIUMTEXT(16777215)
    */
    private String morepic;
        /**
    * @描述: flashurl2 
    * @字段: flashurl2 VARCHAR(255)
    */
    private String flashurl2;
        /**
    * @描述: tjsuoluetu 
    * @字段: tjsuoluetu VARCHAR(255)
    */
    private String tjsuoluetu;
        /**
    * @描述: pingji 
    * @字段: pingji VARCHAR(255)
    */
    private String pingji;
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }
    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public Integer getClassid() {
        return this.classid;
    }
    public void setTtid(Integer ttid) {
        this.ttid = ttid;
    }

    public Integer getTtid() {
        return this.ttid;
    }
    public void setOnclick(Integer onclick) {
        this.onclick = onclick;
    }

    public Integer getOnclick() {
        return this.onclick;
    }
    public void setPlnum(Integer plnum) {
        this.plnum = plnum;
    }

    public Integer getPlnum() {
        return this.plnum;
    }
    public void setTotaldown(Integer totaldown) {
        this.totaldown = totaldown;
    }

    public Integer getTotaldown() {
        return this.totaldown;
    }
    public void setNewspath(String newspath) {
        this.newspath = newspath;
    }

    public String getNewspath() {
        return this.newspath;
    }
    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFilename() {
        return this.filename;
    }
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getUserid() {
        return this.userid;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }
    public void setFirsttitle(Integer firsttitle) {
        this.firsttitle = firsttitle;
    }

    public Integer getFirsttitle() {
        return this.firsttitle;
    }
    public void setIsgood(Integer isgood) {
        this.isgood = isgood;
    }

    public Integer getIsgood() {
        return this.isgood;
    }
    public void setIspic(Integer ispic) {
        this.ispic = ispic;
    }

    public Integer getIspic() {
        return this.ispic;
    }
    public void setIstop(Integer istop) {
        this.istop = istop;
    }

    public Integer getIstop() {
        return this.istop;
    }
    public void setIsqf(Integer isqf) {
        this.isqf = isqf;
    }

    public Integer getIsqf() {
        return this.isqf;
    }
    public void setIsmember(Integer ismember) {
        this.ismember = ismember;
    }

    public Integer getIsmember() {
        return this.ismember;
    }
    public void setIsurl(Integer isurl) {
        this.isurl = isurl;
    }

    public Integer getIsurl() {
        return this.isurl;
    }
    public void setTruetime(Integer truetime) {
        this.truetime = truetime;
    }

    public Integer getTruetime() {
        return this.truetime;
    }
    public void setLastdotime(Integer lastdotime) {
        this.lastdotime = lastdotime;
    }

    public Integer getLastdotime() {
        return this.lastdotime;
    }
    public void setHavehtml(Integer havehtml) {
        this.havehtml = havehtml;
    }

    public Integer getHavehtml() {
        return this.havehtml;
    }
    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    public Integer getGroupid() {
        return this.groupid;
    }
    public void setUserfen(Integer userfen) {
        this.userfen = userfen;
    }

    public Integer getUserfen() {
        return this.userfen;
    }
    public void setTitlefont(String titlefont) {
        this.titlefont = titlefont;
    }

    public String getTitlefont() {
        return this.titlefont;
    }
    public void setTitleurl(String titleurl) {
        this.titleurl = titleurl;
    }

    public String getTitleurl() {
        return this.titleurl;
    }
    public void setStb(Integer stb) {
        this.stb = stb;
    }

    public Integer getStb() {
        return this.stb;
    }
    public void setFstb(Integer fstb) {
        this.fstb = fstb;
    }

    public Integer getFstb() {
        return this.fstb;
    }
    public void setRestb(Integer restb) {
        this.restb = restb;
    }

    public Integer getRestb() {
        return this.restb;
    }
    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public String getKeyboard() {
        return this.keyboard;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }
    public void setNewstime(Integer newstime) {
        this.newstime = newstime;
    }

    public Integer getNewstime() {
        return this.newstime;
    }
    public void setTitlepic(String titlepic) {
        this.titlepic = titlepic;
    }

    public String getTitlepic() {
        return this.titlepic;
    }
    public void setFlashwriter(String flashwriter) {
        this.flashwriter = flashwriter;
    }

    public String getFlashwriter() {
        return this.flashwriter;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }
    public void setStar(Integer star) {
        this.star = star;
    }

    public Integer getStar() {
        return this.star;
    }
    public void setFilesize(String filesize) {
        this.filesize = filesize;
    }

    public String getFilesize() {
        return this.filesize;
    }
    public void setFlashurl(String flashurl) {
        this.flashurl = flashurl;
    }

    public String getFlashurl() {
        return this.flashurl;
    }
    public void setWidth(String width) {
        this.width = width;
    }

    public String getWidth() {
        return this.width;
    }
    public void setHeight(String height) {
        this.height = height;
    }

    public String getHeight() {
        return this.height;
    }
    public void setFlashsay(String flashsay) {
        this.flashsay = flashsay;
    }

    public String getFlashsay() {
        return this.flashsay;
    }
    public void setNewstempid1(String newstempid1) {
        this.newstempid1 = newstempid1;
    }

    public String getNewstempid1() {
        return this.newstempid1;
    }
    public void setNewstempid1Filename(String newstempid1Filename) {
        this.newstempid1Filename = newstempid1Filename;
    }

    public String getNewstempid1Filename() {
        return this.newstempid1Filename;
    }
    public void setMorepic(String morepic) {
        this.morepic = morepic;
    }

    public String getMorepic() {
        return this.morepic;
    }
    public void setFlashurl2(String flashurl2) {
        this.flashurl2 = flashurl2;
    }

    public String getFlashurl2() {
        return this.flashurl2;
    }
    public void setTjsuoluetu(String tjsuoluetu) {
        this.tjsuoluetu = tjsuoluetu;
    }

    public String getTjsuoluetu() {
        return this.tjsuoluetu;
    }
    public void setPingji(String pingji) {
        this.pingji = pingji;
    }

    public String getPingji() {
        return this.pingji;
    }

}

