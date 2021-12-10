class Value{
  private int val = -1;
  private boolean modified;
  public Value(int param){
    this.val = param;
  };
  public Value(){
    this.val = 0;
  };

   public void setVal(int num){
    this.val = num;
    this.modified = wasModified();
  };

   public int getVal(){
    if(this.modified){
      return this.val;
    }
    else if(this.val == (-1)){
      return 0;
    }
    return this.val;
  }

  public boolean wasModified(){
    return true;
  }

  public static void main(String[] args){

  }

}