import java.util.*;
/*
    1. 모든 직선쌍에 대해 반복
        1) 교점 찾기
        2) 정수만 반환
    2. 정수인 교점 리스트에 저장
    3. 교점중 최대 최소 구하기
    4. 최대최소로 2차원 배열 생성
    5. 별 찍기
    6. 문자열로 변환해서 출력
    
*/
class Solution {
    private static class Point{
        public final long x, y;
        private Point(long x, long y){
            this.x = x;
            this.y = y;
        }
    }
        private Point intersection(long a1, long b1, long c1,
                                  long a2, long b2, long c2){
            double x=(double)(b1*c2 - c1*b2)/(a1*b2 - a2*b1);
            double y=(double)(c1*a2 - a1*c2)/(a1*b2 - a2*b1);     
            if(x%1!=0 || y%1!=0)
                return null;
            return new Point((long)x,(long)y);
        }
    
    private Point getMin(List<Point> points){
        long x=Long.MAX_VALUE;
        long y=Long.MAX_VALUE;
        for(Point p:points){
            if(p.x < x) x=p.x;
            if(p.y < y) y=p.y;
        }
        return new Point(x,y);
    }
    private Point getMax(List<Point> points){
        long x=Long.MIN_VALUE;
        long y=Long.MIN_VALUE;
        for(Point p:points){
            if(p.x > x) x=p.x;
            if(p.y > y) y=p.y;
        }
        return new Point(x,y);
    }
    public String[] solution(int[][] line) {
        List<Point> points=new ArrayList<>();
        for(int i=0;i<line.length;i++){
            for(int j=i+1;j<line.length;j++){
                Point intersection=intersection(line[i][0],line[i][1],line[i][2],
                                               line[j][0],line[j][1],line[j][2]);
                if(intersection!=null)
                    points.add(intersection);
            }
        }
        Point min=getMin(points);
        Point max=getMax(points);
        int width=(int)(max.x - min.x + 1);
        int height=(int)(max.y - min.y + 1);
        
        char[][] arr=new char[height][width];
        for(char[] row:arr){
            Arrays.fill(row,'.');
        }
        
        for(Point p:points){
            int x=(int)(p.x-min.x);
            int y=(int)(max.y-p.y);
            arr[y][x]='*';
        }
        
        String[] answer=new String[arr.length];
        for(int i=0;i<answer.length;i++){
            answer[i]=new String(arr[i]);
        }
        return answer;
    }
}