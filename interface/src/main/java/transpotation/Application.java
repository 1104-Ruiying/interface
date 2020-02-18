package transpotation;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {
        chooseTranspotation();

    }

    public static void chooseTranspotation(){
        int money = 300;
        ArrayList<Transpotation> transpotationArrayList =new ArrayList<>();
        transpotationArrayList.add(new Bus());
        transpotationArrayList.add(new Train());
        transpotationArrayList.add(new SelfDriving());
        transpotationArrayList.add(new Plane());
        result(transpotationArrayList, money);
            }
    public static void result(ArrayList<Transpotation> transpotationArrayList, int money){
            ArrayList<String> result = new ArrayList<>();
            for(Transpotation transpotation : transpotationArrayList){
                if (money >= transpotation.getPrice()){
                    result.add(transpotation.getName());
                }
            }
        System.out.println("最终选择的交通方式为：" + result);
            }

        }

