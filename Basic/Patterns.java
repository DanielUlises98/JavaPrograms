package Basic;

public class Patterns {

    public void StairsRight(int row){
        for(int i = 0; i<row;i++){
            for (int j = 0;j <=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }    
    }
    public void StairsLeft(int row){
        System.out.println();
        for(int i = 1; i<=row;i++){
            for(int j = 2*(row-i); j>0;j--){
                System.out.print(" ");
            }
            for(int x = 0; x<i;x++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void Pyramid(int row){
        int spaceAmount = row;
        for(int i =0;i<row;i++){
            spaceAmount--;
            for(int x=spaceAmount;x>0;x--){
                System.out.print(" ");
            }
            for(int j = 0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void DiamonShape(int row){
        int stars = 1;
        int spaceAmount=row;
        for(int i = 0; i<row;i++){
            spaceAmount--;
            for(int x=spaceAmount;x>0;x--){
                System.out.print(" ");
            }
            for(int j =0;j<stars;j++){
                System.out.print("*");
            }
            System.out.println();
            stars+=2;
        }
        stars-=2;
        for(int i =0;i<row-1;i++){
            spaceAmount++;
            stars-=2;
            for(int x=0;x<spaceAmount;x++){
                System.out.print(" ");
            }
            for(int j = stars;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void DownwardTriangle(int row){
        for(int i=row;i>=0;i--){
            for(int j=i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void MirroredTriangle(int row){
        System.out.println();
        int space =row-1;
        for(int i = 1; i<=row;i++){
            space--;
            for(int j = 0; j<=space;j++){
                System.out.print(" ");
            }
            for(int x = 0; x<i;x++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void DownwardPyramid(int row){
        int spaceAmount =0;
        for(int i=row;i>=0;i--){
            for(int j=0;j<spaceAmount;j++){
                System.out.print(" ");
            }
            for(int j=i;j>0;j--){
                System.out.print("* ");
            }
            spaceAmount++;
            System.out.println();
        }
    }
    public void RightDown(int row){
        int space = row;
        for(int i=row;i>0;i--){
            for(int x=0;x<space;x++){
                System.out.print(" ");
            }
            for(int j = i; j>0;j--){
                System.out.print("*");
            }
            System.out.println();
            space++;
        }
    }
    public void RightPascalTriangle(int row){
        for(int i =0 ; i<row;i++){
            for(int j = 0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=row-1; i>0;i--){
            for(int j = i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void LeftPascalTriangle(int row){
        int space = row;
        for(int i = 0; i<row;i++){
            for(int x =space;x>0;x--){
                System.out.print(" ");
            }
            for (int j = 0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
            space--;
        }
        row-=2;
        space++;
        for(int i = row;i>0;i--){
            space++;
            for(int x = 0;x<space;x++){
                System.out.print(" ");
            }
            for(int j = i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public void SandGlassPattern(int row){
        DownwardPyramid(row);
        Pyramid(row);
    }
    public void ALetter(int row){
        int innerLine = row/2;
        for (int i =0;i<row;i++){
            if (i==0 || i==innerLine){
                System.out.println();
                for(int j=innerLine;j>=0;j--){
                    System.out.print("*");
                }
            }
            System.out.println();
            for(int j=innerLine;j>0;j--){
                if (j==innerLine || j==1){
                    System.out.print("*");
                }
                System.out.print(" ");
            }
        }
    }
    
// public void 
}