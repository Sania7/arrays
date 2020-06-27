public class Main {
    public static void main(String[] args) {
        String[] text = {"Каждый", "охотник","желает", "знать", "где", "сидит", "фазан"};

        for (int i = 0;i < text.length; i++)
        {
            System.out.print(text[i] + " ");
        }
        System.out.println();

        int n = text.length;
        //Переменная, которая будет использоваться при обмене элементов
        String temp;

        for (int i = 0; i < n/2; i++) {
            temp = text[n-i-1];
            text[n-i-1] = text[i];
            text[i] = temp;
        }
        //Выводим конечный массив в консоль
        for (int i=0; i<text.length; i++){
            System.out.print(text[i] + " ");
        }
    }
}
