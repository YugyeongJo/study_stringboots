package com.example.co_templates.quests.restapis;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.co_templates.services.CommonCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
@RestController
public class QuestCommonCodeController {
    @Autowired CommonCodeService commonCodeService;
    @GetMapping("/q/r/commonCode/list/{pageNumber}")
    public ResponseEntity<List<HashMap<String, Object>>> list(@PathVariable("pageNumber") Integer pageNumber) {
        ArrayList<HashMap<String, Object>> itemList = new ArrayList<HashMap<String, Object>>();
        // CommonCodeService commonCodeService = new CommonCodeService();
        itemList = commonCodeService.list(pageNumber);
        return ResponseEntity.ok().body(itemList);
    }
    @GetMapping("/q/r/commonCode/view/{pk_id}")
    public ResponseEntity<HashMap<String, Object>> view(@PathVariable("pk_id") Integer pkId) {
        HashMap<String, Object> itemDetails = new HashMap<>();
        itemDetails = commonCodeService.view(pkId);
        return ResponseEntity.ok().body(itemDetails);
    }
}