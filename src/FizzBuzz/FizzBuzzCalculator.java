package FizzBuzz;

public class FizzBuzzCalculator {
    public static String fizzBuzzCalculator(int number) {
        final boolean FIZZ = number % 3 == 0;
        final boolean BUZZ = number % 5 == 0;

        if (FIZZ && BUZZ)
            return "FizzBuzz";
        else if (FIZZ)
            return "Fizz";
        else if (BUZZ)
            return "Buzz";
        else
            return numberReading(number);
    }

    public static String numberReading(int number) {
        final int ONE = 1;
        final int TWO = 2;
        final int THREE = 3;
        final int FOUR = 4;
        final int FIVE = 5;
        final int SIX = 6;
        final int SEVEN = 7;
        final int EIGHT = 8;
        final int NINE = 9;

        int thousand = number / 1000;
        //System.out.println("thousand index: " + thousand);
        int hundred = (number - thousand * 1000) / 100;
        //System.out.println("hundred index: " + hundred);
        int tensDigit = (number - thousand * 1000 - hundred * 100) / 10;
        //System.out.println("tensDigit index: " + tensDigit);
        int unit = number - thousand * 1000 - hundred * 100 - tensDigit * 10;
       // System.out.println("unit index: " + unit);

        String thousandRead;
        switch (thousand) {
            case ONE:
                thousandRead = "one";
                break;
            case TWO:
                thousandRead = "two";
                break;
            case THREE:
                thousandRead = "three";
                break;
            case FOUR:
                thousandRead = "four";
                break;
            case FIVE:
                thousandRead = "five";
                break;
            case SIX:
                thousandRead = "six";
                break;
            case SEVEN:
                thousandRead = "seven";
                break;
            case EIGHT:
                thousandRead = "eight";
                break;
            case NINE:
                thousandRead = "nine";
                break;
            default:
                thousandRead = "";
        }

        String hundredRead;
        switch (hundred) {
            case ONE:
                hundredRead = "one";
                break;
            case TWO:
                hundredRead = "two";
                break;
            case THREE:
                hundredRead = "three";
                break;
            case FOUR:
                hundredRead = "four";
                break;
            case FIVE:
                hundredRead = "five";
                break;
            case SIX:
                hundredRead = "six";
                break;
            case SEVEN:
                hundredRead = "seven";
                break;
            case EIGHT:
                hundredRead = "eight";
                break;
            case NINE:
                hundredRead = "nine";
                break;
            default:
                hundredRead = "";
        }

        String unitRead;
        switch (unit) {
            case ONE:
                unitRead = "one";
                break;
            case TWO:
                unitRead = "two";
                break;
            case THREE:
                unitRead = "three";
                break;
            case FOUR:
                unitRead = "four";
                break;
            case FIVE:
                unitRead = "five";
                break;
            case SIX:
                unitRead = "six";
                break;
            case SEVEN:
                unitRead = "seven";
                break;
            case EIGHT:
                unitRead = "eight";
                break;
            case NINE:
                unitRead = "nine";
                break;
            default:
                unitRead = "";

        }


        String tensDigitRead;
        switch (tensDigit) {
            case TWO:
                tensDigitRead = "twenty";
                break;
            case THREE:
                tensDigitRead = "thirty";
                break;
            case FOUR:
                tensDigitRead = "forty";
                break;
            case FIVE:
                tensDigitRead = "fifty";
                break;
            case SIX:
                tensDigitRead = "sixty";
                break;
            case SEVEN:
                tensDigitRead = "seventy";
                break;
            case EIGHT:
                tensDigitRead = "eighty";
                break;
            case NINE:
                tensDigitRead = "ninety";
                break;
            default:
                tensDigitRead = "";
        }
        if (thousandRead == "")
            if (hundredRead == "")
                if (tensDigitRead == "")
                    if (tensDigit != 0) {
                        if (unit == 0) {
                            unitRead = "ten";
                           return   unitRead;
                        } else {
                            if (unitRead == "one")
                                tensDigitRead = "eleven";
                            else if (unitRead == "two")
                                tensDigitRead = "twelve";
                            else if (unitRead == "three")
                                tensDigitRead = "thirteen";
                            else if (unitRead == "four")
                                tensDigitRead = "fourteen";
                            else if (unitRead == "five")
                                tensDigitRead = "fifteen";
                            else if (unitRead == "six")
                                tensDigitRead = "sixteen";
                            else if (unitRead == "seven")
                                tensDigitRead = "seventeen";
                            else if (unitRead == "eight")
                                tensDigitRead = "eighteen";
                            else if (unitRead == "nine")
                                tensDigitRead = "nineteen";
                            return tensDigitRead;
                        }
                    } else {
                        if (unit == 0)
                            return "zero";
                        else
                            return unitRead;
                    }
                else {
                    if (unit == 0) {
                        return tensDigitRead;
                    } else {
                        return tensDigitRead + " " +unitRead;
                    }
                }
            else {
                if (tensDigitRead == "")
                    if (tensDigit != 0) {
                        if (unit == 0) {
                            unitRead = "ten";
                            return hundredRead + " hundred " + unitRead;
                        } else {
                            if (unitRead == "one")
                                tensDigitRead = "eleven";
                            else if (unitRead == "two")
                                tensDigitRead = "twelve";
                            else if (unitRead == "three")
                                tensDigitRead = "thirteen";
                            else if (unitRead == "four")
                                tensDigitRead = "fourteen";
                            else if (unitRead == "five")
                                tensDigitRead = "fifteen";
                            else if (unitRead == "six")
                                tensDigitRead = "sixteen";
                            else if (unitRead == "seven")
                                tensDigitRead = "seventeen";
                            else if (unitRead == "eight")
                                tensDigitRead = "eighteen";
                            else if (unitRead == "nine")
                                tensDigitRead = "nineteen";
                            return hundredRead + " hundred " + tensDigitRead;
                        }
                    } else {
                        if (unit == 0)
                            return hundredRead + " hundred ";
                        else
                            return hundredRead + " hundred " + unitRead;
                    }
                else {
                    if (unit == 0) {
                        return hundredRead + " hundred " + tensDigitRead;
                    } else {
                        return hundredRead + " hundred " + tensDigitRead + " " + unitRead;
                    }
                }
            }
        else {
            if (hundred == 0) {
                if (tensDigitRead == "")
                    if (tensDigit != 0) {
                        if (unit == 0) {
                            unitRead = "ten";
                            return thousandRead + " thousand " + unitRead;
                        } else {
                            if (unitRead == "one")
                                tensDigitRead = "eleven";
                            else if (unitRead == "two")
                                tensDigitRead = "twelve";
                            else if (unitRead == "three")
                                tensDigitRead = "thirteen";
                            else if (unitRead == "four")
                                tensDigitRead = "fourteen";
                            else if (unitRead == "five")
                                tensDigitRead = "fifteen";
                            else if (unitRead == "six")
                                tensDigitRead = "sixteen";
                            else if (unitRead == "seven")
                                tensDigitRead = "seventeen";
                            else if (unitRead == "eight")
                                tensDigitRead = "eighteen";
                            else if (unitRead == "nine")
                                tensDigitRead = "nineteen";
                            return thousandRead + " thousand " + tensDigitRead;
                        }
                    } else {
                        if (unit == 0)
                            return thousandRead + " thousand ";
                        else
                            return thousandRead + " thousand " + unitRead;
                    }
                else {
                    if (unit == 0) {
                        return thousandRead + " thousand " + tensDigitRead;
                    } else {
                        return thousandRead + " thousand " + tensDigitRead + unitRead;
                    }
                }
            } else {
                if (tensDigitRead == "")
                    if (tensDigit != 0) {
                        if (unit == 0) {
                            unitRead = "ten";
                            return thousandRead + " thousand " + hundredRead + " hundred " + unitRead;
                        } else {
                            if (unitRead == "one")
                                tensDigitRead = "eleven";
                            else if (unitRead == "two")
                                tensDigitRead = "twelve";
                            else if (unitRead == "three")
                                tensDigitRead = "thirteen";
                            else if (unitRead == "four")
                                tensDigitRead = "fourteen";
                            else if (unitRead == "five")
                                tensDigitRead = "fifteen";
                            else if (unitRead == "six")
                                tensDigitRead = "sixteen";
                            else if (unitRead == "seven")
                                tensDigitRead = "seventeen";
                            else if (unitRead == "eight")
                                tensDigitRead = "eighteen";
                            else if (unitRead == "nine")
                                tensDigitRead = "nineteen";
                            return thousandRead + " thousand " + hundredRead + " hundred " + tensDigitRead;
                        }
                    } else {
                        if (unit == 0)
                            return thousandRead + " thousand " + hundredRead + " hundred ";
                        else
                            return thousandRead + " thousand " + hundredRead + " hundred " + unitRead;
                    }
                else {
                    if (unit == 0) {
                        return thousandRead + " thousand " + hundredRead + " hundred " + tensDigitRead;
                    } else {
                        return thousandRead + " thousand " + hundredRead + " hundred " + tensDigitRead + " " + unitRead;
                    }
                }
            }
        }

    }

}
