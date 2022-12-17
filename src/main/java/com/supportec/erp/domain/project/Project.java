package com.supportec.erp.domain.project;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@Entity(name = "프로젝트")
public class Project {

    @Id
    @Column(name = "프로젝트번호")
    private String projectNo;

    @Column(name = "주소지")
    private String address;

    @Column(name = "프로젝트명")
    private String name;

    @Column(name = "수주가능성")
    private String possibility;

    @Column(name = "시행사")
    private String developer;

    @Column(name = "시공사")
    private String constructor;

    @Column(name = "하도급사")
    private String subcontractor;

    @Column(name = "설계사")
    private String designer;

    @Column(name = "공사형태")
    private String shape;

    @Column(name = "공사규모")
    private String scale;

    @Column(name = "형상")
    private String form;

    @Column(name = "장변")
    private Float width;

    @Column(name = "단변")
    private Float length;

    @Column(name = "깊이")
    private Float height;

    @Column(name = "토압")
    private Integer earthPressure;

    @Column(name = "토량")
    private Integer earthVolume;

    @Column(name = "강재")
    private Integer steel;

    @Column(name = "강재계수")
    private Float steelCalculation;

    @Column(name = "실금액")
    private Integer real;

    @Column(name = "총금액")
    private Integer total;

    @Column(name = "수주예상금액")
    private Integer expect;

    @Column(name = "수주예상금액타입")
    private String expectType;

    @Column(name = "접수일")
    private LocalDateTime accept;

    @Column(name = "견적일")
    private LocalDateTime estimate;

    @Column(name = "계약일")
    private LocalDateTime contract;

    @Column(name = "영업담당자")
    private String salesResponsibility;

    @Column(name = "설계담당자")
    private String designResponsibility;

    @Column(name = "시공담당자1")
    private String constructResponsibility1;

    @Column(name = "시공담당자2")
    private String constructResponsibility2;

    @Column(name = "영업단계1")
    private String saleLevel1;

    @Column(name = "영업단계2")
    private String saleLevel2;

    @Column(name = "활성화여부")
    private String activeState;

    @Column(name = "계약확정여부")
    private String pendingReason;

    @Column(name = "보류사유선택")
    private String pendingReasonText;

    @Column(name = "보류사유")
    private String contractState;

    @Column(name = "착공일")
    private LocalDateTime beginDate;

    @Column(name = "설치일")
    private LocalDateTime installDate;

    @Column(name = "준공일")
    private LocalDateTime completionDate;

    @Column(name = "공사진행여부")
    private String constructState;

    @Column(name = "공종구분")
    private String installState;

    @Column(name = "작성자")
    private String writer;

    @Column(name = "작성일")
    private LocalDateTime updateDate;

}
