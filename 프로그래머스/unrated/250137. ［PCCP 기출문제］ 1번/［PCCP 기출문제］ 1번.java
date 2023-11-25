class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int lastatt=attacks[attacks.length-1][0];
        int t=bandage[0];
        int x=bandage[1];
        int y=bandage[2];
        int hp=health;
        int att=0;
        int suc=0;
        for(int i=1;i<=lastatt;i++){
            if(i==attacks[att][0]){
                hp-=attacks[att][1];
                att++;
                suc=0;
                if(hp<=0) return -1;
            }
            else{
                suc++;
                hp+=x;
                if(suc==t){
                    hp+=y;
                    suc=0;
                }
                hp=state(health,hp);
            }
        }
        return hp;
    }
    public int state(int health,int now){
        if(now>health) return health;
        else if(now<=0) return -1;
        return now;
    }
}