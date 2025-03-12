USE PorfolioDB; -- Asegúrate de estar en la base de datos correcta

-- Insertar sabores de vapers con imagen y precio
INSERT INTO sabores (nombre, descripcion, imagen, precio) VALUES
('Blueberry Ice', 'Sabor intenso de arándano con un toque de frescura', '/imagenes/blueberry.png', 5.99),
('Mango Passion', 'Exótica combinación de mango y maracuyá', 'mango_passion.jpg', 6.49),
('Watermelon Chill', 'Refrescante sandía con un toque de menta', 'watermelon_chill.jpg', 5.79),
('Strawberry Banana', 'Mezcla dulce de fresa con banana', 'strawberry_banana.jpg', 6.29),
('Grape Ice', 'Uva dulce con un final helado', 'grape_ice.jpg', 5.99),
('Pineapple Coconut', 'Piña tropical combinada con coco cremoso', 'pineapple_coconut.jpg', 6.89),
('Cola Ice', 'Sabor clásico a cola con un toque de hielo', 'cola_ice.jpg', 5.49),
('Apple Mint', 'Manzana verde refrescante con un toque de menta', 'apple_mint.jpg', 5.99),
('Cherry Bomb', 'Explosión de cereza con notas dulces', 'cherry_bomb.jpg', 6.19),
('Vanilla Caramel', 'Dulce combinación de vainilla y caramelo', 'vanilla_caramel.jpg', 6.79);

INSERT INTO productos (productoid, descripcion, imagen, marca, nombre_producto, precio, tipo, stock, sabor_id) VALUES 
(1, 'Vaper desechable de 5000 puffs, sabor Blueberry Ice', 'vaper_blueberry.jpg', 'Elf Bar', 'Vaper Desechable Blueberry Ice', 12.99, 'Desechable', 30, 1),
(2, 'Vaper recargable con 2 pods incluidos, sabor Mango Passion', 'vaper_mango.jpg', 'Voopoo', 'Vaper Recargable Mango Passion', 24.99, 'Recargable', 20, 2),
(3, 'Vaper desechable de 3000 puffs, sabor Watermelon Chill', 'vaper_watermelon.jpg', 'Puff Bar', 'Vaper Desechable Watermelon Chill', 11.49, 'Desechable', 25, 3),
(4, 'Vaper pod recargable con resistencia de 0.8Ω, sabor Strawberry Banana', 'vaper_strawberry.jpg', 'Geek Vape', 'Vaper Pod Recargable Strawberry Banana', 29.99, 'Pod Recargable', 15, 4),
(5, 'Kit avanzado con tanque de 5ml, sin sabor predefinido', 'vaper_mod.jpg', 'Smok', 'Vaper Mod Kit Avanzado', 45.99, 'Mod', 10, NULL),
(6, 'Resistencia para vapers recargables de 0.6Ω', 'resistencia_06.jpg', 'Voopoo', 'Resistencia 0.6Ω', 4.99, 'Accesorio', 50, NULL),
(7, 'Batería externa recargable 3000mAh para vapers', 'bateria_vaper.jpg', 'Samsung', 'Batería Recargable 3000mAh', 9.99, 'Accesorio', 40, NULL),
(8, 'Cargador USB tipo C para vapers recargables', 'cargador_vaper.jpg', 'Geek Vape', 'Cargador USB-C Vaper', 6.49, 'Accesorio', 35, NULL),
(9, 'Líquido premium de nicotina 30ml, sabor Grape Ice', 'liquido_grape.jpg', 'Nasty Juice', 'Líquido Vaper Grape Ice', 14.99, 'Líquido', 20, 5),
(10, 'Líquido sin nicotina 60ml, sabor Vanilla Caramel', 'liquido_vanilla.jpg', 'Element Vape', 'Líquido Vaper Vanilla Caramel', 19.99, 'Líquido', 15, 10);

