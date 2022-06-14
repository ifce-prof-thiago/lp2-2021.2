package br.ifce.lp2.api;

import br.ifce.lp2.application.products.create.CreateProductInput;
import br.ifce.lp2.application.products.create.CreateProductOutput;
import br.ifce.lp2.application.products.create.CreateProductStory;
import br.ifce.lp2.application.products.find.all.FindAllProductOutput;
import br.ifce.lp2.application.products.find.all.FindAllProductStory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController {

    private final CreateProductStory createProductStory;
    private final FindAllProductStory findAllProductStory;

    public ProductController(CreateProductStory createProductStory, FindAllProductStory findAllProductStory) {
        this.createProductStory = createProductStory;
        this.findAllProductStory = findAllProductStory;
    }

    @PostMapping
    public CreateProductOutput post(@RequestBody CreateProductInput input) {
        return createProductStory.execute(input);
    }

    @GetMapping
    public List<FindAllProductOutput> get() {
        return findAllProductStory.execute();
    }


}
