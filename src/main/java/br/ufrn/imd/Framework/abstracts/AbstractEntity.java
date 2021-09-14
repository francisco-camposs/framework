package br.ufrn.imd.Framework.abstracts;

import br.ufrn.imd.Framework.model.AppUser;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@MappedSuperclass
@EqualsAndHashCode
public abstract class AbstractEntity {

    @Column(nullable = false)
    protected Boolean active = true;

    @Column(name = "created_at", updatable = false, nullable = false)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    protected LocalDateTime createdAt;

    @Column(name = "edited_at")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    protected LocalDateTime editedAt;

    public abstract UUID getId();
    public abstract void setId(UUID id);

    @ManyToOne
    @JoinColumn(name = "created_by", updatable = false)
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    protected AppUser createdBy;

    @ManyToOne
    @JoinColumn(name = "edited_by")
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    protected AppUser editedBy;

    @PrePersist
    public void prePersist(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        AppUser user = (AppUser) authentication.getPrincipal();
        this.setCreatedBy(user);
        this.setCreatedAt(LocalDateTime.now());
    }

    @PreUpdate
    public void preUpdate(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        AppUser user = (AppUser) authentication.getPrincipal();
        this.setEditedBy(user);
        this.setEditedAt(LocalDateTime.now());
    }

}
