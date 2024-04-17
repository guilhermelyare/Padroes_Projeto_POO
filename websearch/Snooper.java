public class Snooper {
    private final WebSearchModel model;

    public Snooper(WebSearchModel model) {
        this.model = model;

        QueryFilterStrategy friendFilter = new FriendQueryFilter();
        QueryFilterStrategy lengthyFilter = new LengthyQueryFilter();

        model.addQueryObserver(new WebSearchModel.QueryObserver() {
            @Override
            public void onQuery(String query) {
                System.out.println("Oh Yes! " + query);
            }
        }, friendFilter);

        model.addQueryObserver(new WebSearchModel.QueryObserver() {
            @Override
            public void onQuery(String query) {
                System.out.println("So long.... " + query);
            }
        }, lengthyFilter);
    }
}
