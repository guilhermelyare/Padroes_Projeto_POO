import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Perform "web search" (from a  file), notify the interested observers of each query.
 */
public class WebSearchModel {
    private final File sourceFile;
    private final List<QueryObserver> observers = new ArrayList<>();
    private final List<QueryFilterStrategy> filterStrategies = new ArrayList<>();

    public interface QueryObserver {
        void onQuery(String query);
    }

    public WebSearchModel(File sourceFile) {
        this.sourceFile = sourceFile;
    }

    public void pretendToSearch() {
        try (BufferedReader br = new BufferedReader(new FileReader(sourceFile))) {
            while ( true) {
                String line = br.readLine();
                if (line == null) {
                    break;
                }
                notifyAllObservers(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addQueryObserver(QueryObserver queryObserver, QueryFilterStrategy filterStrategy) {
        observers.add(queryObserver);
        filterStrategies.add(filterStrategy);
    }

    private void notifyAllObservers(String line) {
        for (QueryObserver obs : observers) {
            
            QueryFilterStrategy strategy = filterStrategies.get(observers.indexOf(obs));

            if (strategy.filter(line)) {
                obs.onQuery(line);
            }
        }
    }
}
