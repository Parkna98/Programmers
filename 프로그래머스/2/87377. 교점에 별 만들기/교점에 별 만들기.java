import java.util.*;
class Solution {
    private static class Point{
        public final long x,y;
        private Point(long x,long y){
            this.x=x;
            this.y=y;
        }
    }
    public String[] solution(int[][] line) {
        /* 문제흐름
           1. 모든직선쌍에대해 반복
              A. 교점좌표구하기
              B. 정수좌표만 저장
           2. 저장된 좌표에 대해 최대,최소구하기
           3. 최대최소만큼 2차원배열 크기 결정
           4. 2차원배열에 별표시
           5. 문자열 배열로 변환후 반환
        */
        List<Point> points=new ArrayList<>();
        for(int i=0;i<line.length;i++){
            for(int j=i+1;j<line.length;j++){
                Point intersection=intersection(line[i][0],line[i][1],line[i][2],line[j][0],line[j][1],line[j][2]);
                if(intersection != null)
                    points.add(intersection);
            }
        }
        Point minPoint=getMin(points);
        Point maxPoint=getMax(points);
        int width=(int)(maxPoint.x - minPoint.x + 1); //배열크기이므로 +1
        int height=(int)(maxPoint.y - minPoint.y + 1);
        
        char[][] arr=new char[height][width];
        for(char[] row:arr)
            Arrays.fill(row,'.');
        
        for(Point p:points){
            int x=(int)(p.x-minPoint.x);
            int y=(int)(maxPoint.y-p.y);
            arr[y][x]='*';
        }
        
        String[] result=new String[arr.length];
        for(int i=0;i<result.length;i++){
            result[i]=new String(arr[i]);
        }
        return result;
    }
    
    private Point intersection(long a,long b, long e,
                              long c, long d, long f){
        double x=(double)(b*f-e*d)/(a*d-b*c);
        double y=(double)(e*c-a*f)/(a*d-b*c);
        if(x%1!=0||y%1!=0) return null;
        return new Point((long)x, (long)y);
    }
    private Point getMin(List<Point> points){
        long x=Long.MAX_VALUE;
        long y=Long.MAX_VALUE;
        for(Point p:points){
            if(p.x<x) x=p.x;
            if(p.y<y) y=p.y;
        }
        return new Point(x,y);
    }
    private Point getMax(List<Point> points){
        long x=Long.MIN_VALUE;
        long y=Long.MIN_VALUE;
        for(Point p:points){
            if(p.x>x) x=p.x;
            if(p.y>y) y=p.y;
            }
        return new Point(x,y);
        
    }
}