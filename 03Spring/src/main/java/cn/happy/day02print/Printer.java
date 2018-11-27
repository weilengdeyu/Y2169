package cn.happy.day02print;/**
 * Created by Happy on 2018-11-15.
 */

/**
 * 作者：微冷的雨
 *
 * @create 2018-11-15
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
public class Printer {
    private Ink ink;
    private Paper paper;
    //行为
    //打印内容 ：：：：我用什么颜色的墨盒，在什么的纸张上打印内容
    public void print(){
        System.out.println("亲，您正在使用"+ink.getColor()+"打印我爱你中国在"+paper.getSize()+"上");
    }

    public Ink getInk() {
        return ink;
    }

    public void setInk(Ink ink) {
        this.ink = ink;
    }

    public Paper getPaper() {
        return paper;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }
}
