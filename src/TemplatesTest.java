import java.util.ArrayList;

/**
 * @author ZhouZeping
 * @date 2023/1/7 - 16:13
 *
 * IDEA中代码模板所处的位置：settings - Editor - live Templates / Postfix Completion
 * 常用模板
 */
public class TemplatesTest {

    //模板一：psvm
    public static void main(String[] args) {
        //模板二：sout
        System.out.println("hello");
        //变形：soutp / soutm / soutv / xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("TemplatesTest.main");
        int num1 =10 ;
        int num2 = 20;
        System.out.println("num2 = " + num2);
        System.out.println(num1);


        //模板三：fori
        String[] arr = new String[]{"Tom","Jerry","Pluto","Frank"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形：iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
        //模板四：list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(456);
        for (Object o : list) {

        }
        //变形：list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //变形：list.forr 倒叙遍历
        for (int i = list.size() - 1; i >= 0; i--) {

        }

    }
}
