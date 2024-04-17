public class LengthyQueryFilter implements QueryFilterStrategy {
    @Override
    public boolean filter(String query) {
        return query.length() > 60;
    }
}