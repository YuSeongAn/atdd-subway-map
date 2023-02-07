package subway.application.service.input;

import subway.domain.SectionCreateDto;

public interface SectionCommandUseCase {

    Long createSection(SectionCreateDto lineCreateDto);

    void deleteLineSection(Long lineId, Long sectionId);

}
