package HAP.Zhou.dto;

import com.hand.hap.system.dto.BaseDTO;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by 周浩然 on 2017/1/13.
 */
@Table(name = "hap_om_order_headers")
public class Company extends BaseDTO {

    @Id
    @Column(name = "COMPANY_ID")
    private Long companyId;
    @Column(name = "COMPANY_NUMBER")
    private String companyNumber;
    @Column(name = "COMPANY_NAME")
    private String companyName;
    @Column(name = "ENABLED_FLAG")
    private String enabledFlag;
    @Column(name = "CREATION_DATE")
    private Date creationDate;
    @Column(name = "CREATED_BY")
    private Long createBy;
    @Column(name = "LAST_UPDATED_BY")
    private Long LastUpdatedBy;
    @Column(name ="LAST_UPDATE_DATE")
    private Date LastUpdateDate;
    @Column(name = "LAST_UPDATE_LOGIN")
    private Long LastUpadteLogin;

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getCompanyNumber() {
        return companyNumber;
    }

    public void setCompanyNumber(String companyNumber) {
        this.companyNumber = companyNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getEnabledFlag() {
        return enabledFlag;
    }

    public void setEnabledFlag(String enabledFlag) {
        this.enabledFlag = enabledFlag;
    }

    @Override
    public Date getCreationDate() {
        return creationDate;
    }

    @Override
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    @Override
    public Long getLastUpdatedBy() {
        return LastUpdatedBy;
    }

    @Override
    public void setLastUpdatedBy(Long lastUpdatedBy) {
        LastUpdatedBy = lastUpdatedBy;
    }

    @Override
    public Date getLastUpdateDate() {
        return LastUpdateDate;
    }

    @Override
    public void setLastUpdateDate(Date lastUpdateDate) {
        LastUpdateDate = lastUpdateDate;
    }

    public Long getLastUpadteLogin() {
        return LastUpadteLogin;
    }

    public void setLastUpadteLogin(Long lastUpadteLogin) {
        LastUpadteLogin = lastUpadteLogin;
    }
}

