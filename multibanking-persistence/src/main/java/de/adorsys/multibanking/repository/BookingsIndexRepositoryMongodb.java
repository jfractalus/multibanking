package de.adorsys.multibanking.repository;

import de.adorsys.multibanking.domain.BookingsIndexEntity;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by alexg on 03.07.18.
 */
@Repository
@Profile({"mongo", "fongo"})
public interface BookingsIndexRepositoryMongodb extends MongoRepository<BookingsIndexEntity, String> {

    Optional<BookingsIndexEntity> findByUserIdAndAccountId(String userId, String accountId);
}
