package thanatos.mvphelper;

import java.util.List;

/**
 * Created by lxf52 on 2016/11/28.
 */

public class Thing {


    /**
     * titlepicture : inform/images/info.png
     * titlepictureurl : inform/index.html
     * technology : technology/index.html
     * data : [{"picture":"share/list_picture/shuidianfenxiang-1.jpg","describe":"达人装修经验谈?开关安装全攻略","content":"房子装修每处装修都不能马虎，小小的开关插座若不经精心布置，不仅带来使用不便，而且会导致危险事故。","url":"share/html/shuidianfenxiang-1.html"},{"picture":"share/list_picture/shuidianfenxiang-2.jpg","describe":"家庭装修水电改造这样才规范","content":"装修已经成为很多家庭的不折不扣的大事，对于没有装修经验的人来说装修却是一件很头疼的事。","url":"share/html/shuidianfenxiang-2.html"},{"picture":"share/list_picture/shuidianfenxiang-3.jpg","describe":"家装电路布线必看的基本原则","content":"电路设计和改造一直是装修的重点，不规范的布线和施工会影响到业主们日后的生活。","url":"share/html/shuidianfenxiang-3.html"},{"picture":"share/list_picture/shuidianfenxiang-4.jpg","describe":"跑现场，令人放心的水电施工是什么样的?","content":"水电施工是装修者最为重视也最怕出问题的一步。水电做不好，入住后真是后患无穷。","url":"share/html/shuidianfenxiang-4.html"},{"picture":"share/list_picture/shuidianfenxiang-5.jpg","describe":"史上最详细水电验收标准 新房水电验收你不懂能行吗?","content":"水电工程是家装的五大工程之一，无论是施工还是验收，都不能马虎。那么，水电验收技巧有哪些?","url":"share/html/shuidianfenxiang-5.html"},{"picture":"share/list_picture/shuidianfenxiang-6.jpg","describe":"水电\u201c横平竖直\u201d不好?但这个工地确实吸引了我！","content":"以前总是听别人说水电不一定要横平竖直，在装修之前看过很多的工地，乱丢丢的有很多，很难有做到非常整齐、规范化的。","url":"share/html/shuidianfenxiang-6.html"},{"picture":"share/list_picture/shuidianfenxiang-7.jpg","describe":"水电安装走天花好还是走地面好?别纠结了，水电师傅告诉你！","content":"水电工程是家装中的隐蔽工程，我们在家装中经常会看到水电安装的两种走法，一种是走天花；一种是走地面。","url":"share/html/shuidianfenxiang-7.html"},{"picture":"share/list_picture/shuidianfenxiang-8.jpg","describe":"水电定位最容易遗漏的3个地方，忽略任何一个都会非常麻烦！","content":"水电定位是装修中最最基础的环节，是水电改造的第一步。水电定位是要确定水电的开关、插座等的布局，如果前期没有设计好的话，入住后可能会出现问题。","url":"share/html/shuidianfenxiang-8.html"},{"picture":"share/list_picture/shuidianfenxiang-9.jpg","describe":"水电施工四重咒，怎么破?","content":"水电装修是家居装修的基础核心工程，不但关系到房屋装修的好坏，还关系到家人的身心安全，因此，水电装修需要重视再重视。","url":"share/html/shuidianfenxiang-9.html"},{"picture":"share/list_picture/shuidianfenxiang-10.jpg","describe":"水电装修师傅教徒弟：这些水电改造步骤掌握轻松月入两万","content":"水电安装是家装至关重要的隐患问题，也是大多数业主相对关心的问题。所以在施工中千万不要怕麻烦，哪怕我们什么都参与不了，也要多查阅相关资料和注意事项。","url":"share/html/shuidianfenxiang-10.html"},{"picture":"share/list_picture/shuidianfenxiang-11.jpg","describe":"水电装修是不是必须开槽啊，要不要遵循水走天电走地规则 ","content":"水电装修一直流传着这样一句话，水走天，电走地，不知道多少人听过。电线走地很常见，水走天的装修布管却不怎么常见。","url":"share/html/shuidianfenxiang-11.html"},{"picture":"share/list_picture/shuidianfenxiang-12.jpg","describe":"卫生间装修最易忽视一些问题","content":"卫生间装修注意事项有哪些呢？小小的卫生间虽然面积不大，但是要注意的细节却很多，想要打造一个完美的卫生间，就一定要在装修前做好功课。","url":"share/html/shuidianfenxiang-12.html"},{"picture":"share/list_picture/shuidianfenxiang-13.jpg","describe":"小编教你如何做装修预算","content":"装修是一项系统工程，最让人纠结的就是做预算和费用支出，不少朋友做预算的时候不知道从何下手，想到什么就把价格写下了事，最终往往会造成装修资金严重超支。","url":"share/html/shuidianfenxiang-13.html"},{"picture":"share/list_picture/shuidianfenxiang-14.jpg","describe":"正确示范vs错误示范，水电改造你必须知道的施工规范！","content":"装修除了要好看，更要经久耐用，住了几年之后万一隐蔽工程出问题，想要检修十分麻烦，所以一开始就不能大意。","url":"share/html/shuidianfenxiang-14.html"},{"picture":"share/list_picture/shuidianfenxiang-15.jpg","describe":"装修到入住，19个装修流程你必须知道！","content":"新房下来后大多数业主都会选择为自己的新房进行装修，说到新房装修很多第一次装修的业主们都会很迷茫，都会感到无从下手，那么新房如何装修?","url":"share/html/shuidianfenxiang-15.html"},{"picture":"share/list_picture/shuidianfenxiang-16.jpg","describe":"装修水电改多了花钱改少了又不够用，家居水电点位布置表，超全","content":"家装中水电改造是比较重要的一项。水电改造之前大部分都是装修的水电师傅和自己到房子现场确定水电改造的具体点位布置。","url":"share/html/shuidianfenxiang-16.html"},{"picture":"share/list_picture/shuidianfenxiang-17.jpg","describe":"装修水电隐秘工程 不可大意 后悔药太贵","content":"水电路改造要考虑好各种开关、插座的位置；上下水的位置；插座、浴霸、灯线一定要预留好。","url":"share/html/shuidianfenxiang-17.html"},{"picture":"share/list_picture/shuidianfenxiang-18.jpg","describe":"装修小白成长记？家装水电验收注意事项","content":"水电改造是家庭装修的第一步，也是关系到日后居家生活最关键的基础步骤，但对大多数非专业人士来说，自己家进行水电验收时却并不清楚哪些是不规范的施工。","url":"share/html/shuidianfenxiang-18.html"},{"picture":"share/list_picture/shuidianfenxiang-19.jpg","describe":"装修隐蔽工程要谨慎","content":"新居装修中不少业主都曾经遇到过尴尬的事情：装修结束后，看起来各方面达到自己当初设计的效果，但是一旦验收完毕，或者入住一小段时间后，却发现工程项目存在许多想不到的问题，比如墙漆脱落、瓷砖空鼓、墙面开裂等等。据业内人士分析，这些问题的出现主要是和装修时细节处理不到位、施工不规范有关。","url":"share/html/shuidianfenxiang-19.html"},{"picture":"share/list_picture/shuidianfenxiang-20.jpg","describe":"装修用普通电线还是阻燃电线?这个真问倒了很多人","content":"在购买电线电缆时，如何快速、准确的选择到质量上乘，价格优惠的电线，是每个想要自己购买电线用户，必须掌握的技能。","url":"share/html/shuidianfenxiang-20.html"}]
     */

    private String titlepicture;
    private String titlepictureurl;
    private String technology;
    /**
     * picture : share/list_picture/shuidianfenxiang-1.jpg
     * describe : 达人装修经验谈?开关安装全攻略
     * content : 房子装修每处装修都不能马虎，小小的开关插座若不经精心布置，不仅带来使用不便，而且会导致危险事故。
     * url : share/html/shuidianfenxiang-1.html
     */

    private List<DataBean> data;

    public String getTitlepicture() {
        return titlepicture;
    }

    public void setTitlepicture(String titlepicture) {
        this.titlepicture = titlepicture;
    }

    public String getTitlepictureurl() {
        return titlepictureurl;
    }

    public void setTitlepictureurl(String titlepictureurl) {
        this.titlepictureurl = titlepictureurl;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        private String picture;
        private String describe;
        private String content;
        private String url;

        public String getPicture() {
            return picture;
        }

        public void setPicture(String picture) {
            this.picture = picture;
        }

        public String getDescribe() {
            return describe;
        }

        public void setDescribe(String describe) {
            this.describe = describe;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
