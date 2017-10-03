public class ProjectOne {
    private static final String charSequence = "abcabcabc";

    public static int testSubsequence(String s){
        StringBuilder front = new StringBuilder();
        StringBuilder back = new StringBuilder();
        int lengthOfSequence = s.length()-1;
        int i;
        for(i=0; i<lengthOfSequence; i++ ){
            front.append(s.charAt(i));
            back.append(s.charAt(lengthOfSequence-i));
    StringBuilder LocalStringBuilder = new StringBuilder(back.toString());
            if(LocalStringBuilder.reverse().toString().equals(front.toString())){
        if((s.length()%front.toString().length())==0){
            if(s.charAt(i+1)==front.charAt(0)){
                break;
            }
        }
    }
}

        return (lengthOfSequence+1)/front.toString().length();
                }


    public static void main(String[] args){
        System.out.println("Sequence:" + charSequence);
        System.out.println("Number of slices: " + testSubsequence(charSequence));
    }

}
