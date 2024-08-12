package behavioral.observer;

public class NewsChannel2 implements Channel {
    private String news;

    @Override
    public void update(Object o) {
        this.news = (String) o;
        System.out.println("News '" + this.news + "' sent to  CHANNEL 1");
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }
}
