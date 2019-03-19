package main.simpleFactory;

public class SimpleFactory {

    /**
     * 根据传入的参数，动态决定生成那种对象
     *
     * 思考：当又添加一个电脑品牌，那么就需要修改工厂类，添加逻辑就不符合开闭原则了
     * @param name
     * @return
     */
    public Computer createOne(String name){
        if("dell".equals(name)){
            return new Dell();
        }else if("apple".equals(name)){
            return new Apple();
        }
        System.out.println("当前简单工厂，不能生产出你想要的的产品");
        return null;
    }

    /**
     * 对上一个方法的优化。采用反射可以避免每添加一个电脑产品就进行修改逻辑问题。
     * 思考：方法参数是字符串，可控性有待提升，还需要强制转型
     *
     * @param className
     * @return
     */
    public Computer createTwo(String className){
        try{
            if(!(null==className||"".equals(className))){
                return (Computer) Class.forName(className).newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;

    }

    /**
     * 对上一个方法的优化
     * 反射：参数自动转化为指定类型
     *
     * @param clazz
     * @return
     */
    public Computer  createThree(Class<? extends Computer> clazz){
        try {
            if(null!=clazz){
                return clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }



}
