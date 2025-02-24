public class TvController implements Controller{
    boolean powerflag;
    int volume;
    int channelNumber;

    public TvController(int channelNumber, int volume){
        this.channelNumber = channelNumber;
        this.volume = volume;
        this.powerflag = true;
    }

    @Override
    public void on(){
        this.powerflag = true;
        System.out.println("TV전원 On");
    }

    @Override
    public void off(){
        this.powerflag = false;
        System.out.println("TV전원 Off");
    }

    @Override
    public void pressPlusButton(){
        if(this.powerflag){
            this.volume++;
        } else {
            System.out.println("볼륨을 조절 할 수 없습니다.");
        }
    }
    @Override
    public void pressMinusButton(){
        if(this.powerflag){
            this.volume--;
        } else {
            System.out.println("볼륨을 조절 할 수 없습니다.");
        }
    }
    @Override
    public void pressUpButton(){
        if(this.powerflag){
            this.channelNumber++;
        } else {
            System.out.println("채널을 조절 할 수 없습니다.");
        }
    }
    @Override
    public void pressDownButton(){
        if(this.powerflag){
            this.channelNumber--;
        } else {
            System.out.println("채널을 조절 할 수 없습니다.");
        }
    }

    public void showTvInformation(){
        if(powerflag){
            System.out.println("TV Controller 입니다.");
            System.out.println("현재 전원 상태: "+this.powerflag);
            System.out.println("현재 Channel: "+this.channelNumber);
            System.out.println("현재 Volume: "+this.volume);
        } else {
            System.out.println("TV전원이 꺼져있습니다.");
        }
    }
}