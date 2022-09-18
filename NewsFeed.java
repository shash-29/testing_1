/* *
 * Use static array for NewsFeed
 * with constant MAX_SIZE
 * */

public class NewsFeed {

    private Post[] messages;
    private int size;
    public static final int MAX_SIZE = 25;

    public NewsFeed() {
    	this.messages = new Post[MAX_SIZE];
        this.size = 0;
    }

    public void add(Post message) {
        messages[size] = message;
        size++;
    }

    public Post get(int index) {
	     return messages[index];
    }

    public int size() {
	     return size;
    }

	  public void sort(){
			int i, j, argMin;
			Post tmp;
			for (i = 0; i < size - 1; i++) {
				argMin = i;
				for (j = i + 1; j < size(); j++) {
					if (messages[j].compareTo(messages[argMin]) < 0) {
						argMin = j;
					}
				}

  			tmp = messages[argMin];
  			messages[argMin] = messages[i];
  			messages[i] = tmp;
		}

	  }

  	public NewsFeed getPhotoPost(){

        NewsFeed photoFeed = new NewsFeed();
        for (int i =0; i<this.size; i++) {
            if (messages[i] instanceof PhotoPost) {
                photoFeed.add(messages[i]);
            }
        }
        return photoFeed;
  	}

  	public NewsFeed plus(NewsFeed other){
        NewsFeed plusFeed = new NewsFeed();

        for (int i=0; i< size; i++) {
            plusFeed.add(messages[i]);
        }
        for (int i=0; i< other.size; i++) {
            plusFeed.add(other.messages[i]);
        }
        plusFeed.sort();
        return plusFeed;
  	}

}