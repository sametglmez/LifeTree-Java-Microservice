package lifetree.dailyproducer.model;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@ToString
public class Daily implements Serializable {

    private Long dailyId;

    private Date time;

    private Double latitude;

    private Double longitude;

    private String text;

    private String userName;
}
