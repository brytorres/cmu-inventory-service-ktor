:begin
CREATE
(amzn:Supplier {name: 'Amazon', phoneNumber: ''}),
(avry:Supplier {name: 'Avery', phoneNumber: ''}),
(bmsb:Supplier {name: 'Botanica Mi Santa Barbara', phoneNumber: '3213453455'}),
(csc:Supplier {name: 'Chacana Spiritual Center', phoneNumber: ''}),
(ce:Supplier {name: 'Creative Energy', phoneNumber: ''}),
(eew:Supplier {name: 'Essential Elements Wellness', phoneNumber: '3211231234'}),
(etsy:Supplier {name: 'Etsy', phoneNumber: ''}),
(gb:Supplier {name: 'Gani Baba', phoneNumber: ''}),
(hf:Supplier {name: 'Harbor Freight', phoneNumber: ''}),
(nauc:Supplier {name: 'Nautical Collections', phoneNumber: ''}),
(oldt:Supplier {name: 'Old Time Pottery', phoneNumber: ''}),
(penj:Supplier {name: 'Penjing Bonsai Garden', phoneNumber: ''}),
(pblx:Supplier {name: 'Publix', phoneNumber: ''}),
(riog:Supplier {name: 'Rio Grande', phoneNumber: ''}),
(sptu:Supplier {name: 'Spirits2U', phoneNumber: ''}),
(stpl:Supplier {name: 'Staples', phoneNumber: ''}),
:commit

(can:Material {name: 'White Candle', price: 1.90, sku: 119345352, qty: 20}),
(can)-[:SUPPLIED_BY]->(ee)

CREATE INDEX FOR (s:Supplier) ON (s.name)