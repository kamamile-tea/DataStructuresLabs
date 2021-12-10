class Args{
  public static void main(String[] args){
    if(args.length == 0){
      displayHelp();
    }
    else if(args.length < 4){
      argsError();
    }
    else{
      processArgs(args);
    }
  }
}