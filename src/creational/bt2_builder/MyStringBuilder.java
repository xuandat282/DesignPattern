package creational.bt2_builder;

public class MyStringBuilder {
    String str;

    public MyStringBuilder(Builder builder) {
        this.str = builder.str;
    }

    @Override
    public String toString() {
        return "MyStringBuilder{" +
                "str='" + str + '\'' +
                '}';
    }

    public static class Builder{
        String str;
        public Builder(String str) {
            this.str = str;
        }
        public Builder addString(String s){
            this.str = str + s;
            return this;
        }
        public Builder addFloat(Float f){
            this.str = str + f;
            return this;
        }
        public Builder addBool(Boolean b){
            this.str = str + b;
            return this;
        }
        public MyStringBuilder build(){
            return new MyStringBuilder(this);
        }
    }
}
