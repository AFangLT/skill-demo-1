public class SkillDemo {
    int num;

    SkillDemo(int num) {
        this.num = num;
    }

    public boolean greaterThan(int c) {
        if(this.num > c) {
            return true;
        }
        else return false;
    }
}