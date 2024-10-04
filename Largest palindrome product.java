public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        String x;
        StringBuilder sb;
        int ori;
        for(int i=999;i>=100;i--){
            for(int j=999;j>=100;j--){
                ori=i*j;
                x=String.valueOf(ori);
                sb=new StringBuilder(x);
                sb=sb.reverse();
                if(x.equals(sb.toString())){
                    list.add(ori);
                }
            }
        }
        Collections.sort(list,Collections.reverseOrder());


    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for(int a0 = 0; a0 < t; a0++){
        int n = in.nextInt();
        for(int i=0;i<list.size();i++){
            if(list.get(i)<n){
                System.out.println(list.get(i));
                break;
            }
        }
    }
}
