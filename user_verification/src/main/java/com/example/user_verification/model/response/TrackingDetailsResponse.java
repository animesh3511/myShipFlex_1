package com.example.user_verification.model.response;


import com.example.user_verification.model.DeliveryStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TrackingDetailsResponse {

    private String trackingId;
    private String itemShipped;
    private Long pickup;
    private LocalDateTime date;
    private Long boxes;
    private String weight;
    private String carrier;
    private String from;
    private String to;
    private String total;
    private String service;
    private DeliveryStatus deliveryStatus;

   /* private NewShipmentDetails newShipmentDetails;
    private NewShipmentMethods newShipmentMethods;
    private List <CommodityDetails> commodityDetails;
    private List<BoxDetails> boxDetails;
    private CommercialInvoice commercialInvoice;
    private CargoDetails cargoDetails;
    private Insurance insurance;
    private PickupScheduler pickupScheduler;*/

}
