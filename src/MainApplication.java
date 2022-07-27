import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainApplication {
    public static void main(String[] args) {
//       BookingService

        //search movie, in that location,
        //Book the ticket
        //enter address, payment details
        //Notification
        //Cancel application
//        ----------------------
//        NFR: Consistent(booking and cancel flow) , Highly Available, Low latency

//        Flow

//        User -> TBS -> (Feed Service, Book Service(booking, cancellation), Search Service, Notification Service, DataInjestionService)
        // Movie, City, Show, ShowType, Seat, SeatType, User, PaymentStatus, BookingStatus,
        //SQL Database(ACID)

        //Search Service(); Elastic Search(Full text search ): Movie, Show, City
        //DataInjestionService: admin will use to injest the data into the system.
        //Book Service(/book, /cancel)
        //FeedService(//feed, etc) Cache -> Database
        //Notification Service(sending alerts to the user)

        //SQL Database(ACID):
        //City would have shows(Weak Association = Aggregation), but Show is not present without City (String Association = Composition)
        //Show would have Seat(WA), Seat won't exists without Show(SA)
        //City would have Shows, Show would have Movies

        //Cache => Search results,
        //write - read databases with replication
        //Asyncronous flow: FeedService - Publish(search criteria) - KAFKA -- SearchService - Consumer()
        //Booking Service - confirmation - KAFKA - Notification Service
        //InjestionService - KAFKA -

        //Metrics, Monitoring, APM
//        CPU, Disk, Memory
        //Grafana

        //Load Testing, Resiliency Testing, Fault tolerant

    }
}
