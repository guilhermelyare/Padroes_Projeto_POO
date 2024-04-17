public class FriendQueryFilter implements QueryFilterStrategy {
    @Override
    public boolean filter(String query) {
        return query.toLowerCase().contains("friend");
    }
}