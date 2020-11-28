import java.util.Arrays;
class P406 {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people);
        System.out.println(Arrays.toString(people));
        return people;
    }    
}