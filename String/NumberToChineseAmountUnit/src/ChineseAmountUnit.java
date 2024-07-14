package String.NumberToChineseAmountUnit.src;

public class ChineseAmountUnit {
    public static String[] ChineseAmount = {
        "零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"
    };
    public static String[] ChineseAmountUnit = {
        "万", "拾", "佰", "仟", "亿"
    };
    public static String ChineseAmountEnd = "元整";
    private String number = new String();

    /**
     * @param number 需要转换为中文大写金额的数字
     * @return String
     */
    public String toAmountUnit(int number) {
        // 判断number是否是负数或0，如果是将直接返回null。
        if (number <= 0) {
            return null;
        }

        StringBuilder result = new StringBuilder();                               // 返回值
        this.number = String.valueOf(number);                       // 将当前number转换为string用于处理
        int numberLength = String.valueOf(this.number).length();    // number的长度

        // 当number的长度大于 5（单位万）
        if (numberLength > 5) {
            StringBuilder highAmountString = new StringBuilder();

            // 将所有的高位的数字进行大写转换
            for (int highI = numberLength - 4; highI > 0; highI--) 
                highAmountString.append(toAmount(getSubscript(highI - 1)));
            // 反转
            highAmountString.reverse();
            
            // 将高位的数字添加单位
            for (int highJ = 0; highJ < highAmountString.length(); highJ++) {
                // 获取下标，并带入单位写入
                int subscript = (highAmountString.length() - highJ) - 1;
                result.append(highAmountString.charAt(highJ) + ChineseAmountUnit[subscript]);
            }
            
            // 对低位的数值处理
            for (int lowI = 0; lowI < 4; lowI++) {
                int lowNumberSub = getSubscript(lowI + highAmountString.length());  // 通过lowI获取下标
                int UnitSub = (ChineseAmountUnit.length - 2) - lowI;

                // 将大写数字及单位写入
                if (UnitSub != 0) {
                    result.append(toAmount(lowNumberSub) + ChineseAmountUnit[UnitSub]);
                } else {
                    result.append(toAmount(lowNumberSub) + ChineseAmountEnd);
                }
            }
        // 单位万以下的处理方法
        } else {
            for (int i = 0; i <= 3 ; i++) {
                String Amount = ChineseAmount[getSubscript(i)]; // 大写的数字
                int UnitSub = (ChineseAmountUnit.length - 2) - i;
                
                if (UnitSub != 0) {
                    result.append(Amount + ChineseAmountUnit[UnitSub]);
                } else {
                    result.append(Amount + ChineseAmountEnd);
                }
            }
            
        }

        return result.toString();
    };

    /**
     * @param number int 需要转换大写的数字
     * @return String
     */
    public String toAmount(int number) {
        if (number > (ChineseAmount.length - 1)) {
            return null;
        }
        return ChineseAmount[number];
    }

    /**
     * @param i 需要获取到this.number数值的下标
     * @return int
     */
    private int getSubscript(int i) {
        return Character.getNumericValue(this.number.charAt(i));
    }
}
