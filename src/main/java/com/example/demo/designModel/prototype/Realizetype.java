package com.example.demo.designModel.prototype;

/**
 * @ClassName Realizetype
 * @Description: TODO
 * @Author Administrator
 * @Date 2020/6/10 15 58
 * @Version V1.0
 **/
public class Realizetype implements  Cloneable{

    //用一个已经创建的实例作为原型，通过复制该原型对象来创建一个和原型相同或相似的新对象。
    Realizetype(){
        System.out.println("原型创建成功");
    }

    @Override
    protected Realizetype clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功");
        return (Realizetype)super.clone();
    }

    public static void main(String[] args) {

        Realizetype realizetype = new Realizetype();
        try {
            Realizetype clone = realizetype.clone();
            System.out.println("realizetype==clone?" + (realizetype==clone));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
