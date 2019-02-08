 


public class NormalizeAngle {

    public Integer normalizeValueUsingModulo(Integer angle){
        int y = angle % 360;
        return y;
    }

    public Integer normalizeValueUsingFloorMod(Integer integer){
        int x = Math.floorMod(integer, 360);
        return x;
    }

    public static void main(String[] args){

    }
}
