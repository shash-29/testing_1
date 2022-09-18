public class PhotoPost extends Post {

    private String fileName;
    private String caption;

    public PhotoPost(String user, String file, String capt) {
      super(user);
      this.fileName = file;
      this.caption = capt;
    }

    public String getCaption() {
       return caption;
    }

    public String getFileName() {
       return fileName;
    }

    public String toString() {
      String str = new String();
      str = super.toString() + ", " + fileName + ", " + caption;
      return str;
    }

}