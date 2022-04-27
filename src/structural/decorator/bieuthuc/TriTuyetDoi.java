package structural.decorator.bieuthuc;

public class TriTuyetDoi extends BieuThucDecorator{


    public TriTuyetDoi(BieuThuc bieuThuc) {
        super(bieuThuc);
    }

    @Override
    public float giaTri() {
        if(bieuThuc.giaTri() <0){
            return bieuThuc.giaTri()*-1;
        }else{
            return bieuThuc.giaTri();
        }
    }

    @Override
    public String bieuThuc() {
        return "|" + bieuThuc.giaTri() + "|";
    }
}
