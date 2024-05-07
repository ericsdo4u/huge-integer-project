import exception.HugeIntegerException;

public class HugeInteger {
    private String number;

    private int[] arrayOfFortyElement;

    public int[] getArrayOfFortyElement() {
        return arrayOfFortyElement;
    }
    public HugeInteger(String number) {
        if (number.length() > 40 ){
            throw new HugeIntegerException("number cannot be more than 40");
        }
        String regex = "\\d+";
        if (!number.matches(regex))
            throw new HugeIntegerException("not a valid number");
        this.arrayOfFortyElement = parse(number);
        this.number = number;

    }
    
    public int[] parse(String element){
        int[] array = new int[element.length()];
        for (int num = 0; num< element.length(); num++){
            array[num]= Integer.parseInt(String.valueOf(element.charAt(num)));
        }
        return array;

    }
    public String toString(){
        return number;
    }

    public HugeInteger add(HugeInteger hugeInteger1) {
        int [] numbers;
        int length1 = this.toString().length();
        int length2 = hugeInteger1.toString().length();
        String caller = this.toString();
        String called = hugeInteger1.toString();
        if (length1 > length2){
            numbers = new int[length1+1];
        } else {
            numbers = new int[length2+1];
        }
        for(int count = numbers.length -1; count >= 0 ; count--){
            int value = caller.charAt(length1--) + called.charAt(length2--);
            numbers[count] += value%10;
            numbers[count-1] += value/10;
//            if (numbers[count] > 9) {
//                int i = numbers[count] - 10;
//                numbers[count] = i;
//
//            }
        }
        return  new HugeInteger(convert(numbers));
    }
    private static HugeInteger convert(int[] number){
        String

    }
}
