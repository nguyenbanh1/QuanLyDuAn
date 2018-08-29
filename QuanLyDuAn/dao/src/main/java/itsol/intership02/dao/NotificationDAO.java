package itsol.intership02.dao;

import itsol.intership02.entities.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface NotificationDAO extends JpaRepository<Notification, Integer> {
    Optional<Notification> findByCode(String code);

}