package mission.W3_BeProject;

import java.util.function.ToDoubleBiFunction;

public class Customer {
   //자신의 Cache 와 배송 주문선호 여부
    private boolean preferDelivery;
    private long cache;
    private String myFeeling;

    public Customer(){
        this.myFeeling = "보통";
    }

    //TODO : 운동화 정보요청
    public  void askSneakersInfo(Staff staff){
        System.out.println("손님 : 나이키 운동화에 대해서 알려주세요");
    }

    //다음에 올게요
    public void sayBye(){
        System.out.printf("손님: 다음에 올게요, 기분은 %s이고 돈은 %d 남아있습니다.\\n",this.myFeeling,this.cache);
    }

    //결제 진행
    public void sayOrder(){
        System.out.println("손님: 결제 진행할게요");
    }

    //재고 없음 - 배송진행
    public boolean isPreferDelivery(){
        return preferDelivery;
    }
    public long maykePayment(long nikePrice){
        this.cache-=nikePrice;
        return nikePrice;
    }

    public long getCache() {
        return cache;
    }

    public String getMyFeeling() {
        return myFeeling;
    }

    public void setPreferDelivery(boolean preferDelivery) {
        this.preferDelivery = preferDelivery;
    }

    public void setCache(long cache) {
        this.cache = cache;
    }

    public void setMyFeeling(String myFeeling) {
        this.myFeeling = myFeeling;
    }

    public void wearSneakers(Sneakers sneakers){
        this.myFeeling="좋음";
        System.out.printf("손님: 이 신발은 %s 특징이 느껴짐, 기분은 %s 이고 돈은 %d 남았습니다.\\n",
                ,this.myFeeling, this.cache);
    }

    //환불요청
    public void requireRefund(){
        System.out.println("손님: 배송료가 너무 비싸요, 신발 환불해주세요.");
    }
//환불 이후

}
