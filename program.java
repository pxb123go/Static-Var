class counter{
    int num=10;

    void increament(){
        num=num+1;
        System.out.println(num);
    }

    public static void main(String[] args) {
        counter c1=new counter();
c1.increament();
counter c2=new counter();
c2.increament();
    }
    }
