package com.example.user_verification.repository;

import com.example.user_verification.model.NewShipmentDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface NewShipmentDetailsRepository extends JpaRepository<NewShipmentDetails, Long> {

    boolean existsByCompanyId(Long companyId);

    List<NewShipmentDetails> findByCompanyId(Long companyId);

    @Query(value = "SELECT MAX(tracking_id) FROM new_msf_shipment_details", nativeQuery = true)
    String findLatestTrackingId();

    NewShipmentDetails findByTrackingId(String trackingId);
}
